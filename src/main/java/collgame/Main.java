package collgame;

import collgame.comands.*;
import collgame.dto.Dragon;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("save.json");

        // Checking if the specified file exists or not
        if (f.exists())

            // Show if the file exists
            System.out.println("Exists");
        else

            // Show if the file does not exists
            System.out.println("Does not Exists");

        //make our collection
        Gson gson = new Gson();
        var jsonString = readFileIntoString("save.json");
        ArrayList<Dragon> dragonArrayList = gson.fromJson(jsonString, new TypeToken<List<Dragon>>(){}.getType());
        boolean isCommandFound;

        var commandHashMap = createCommands();

        Scanner sc = new Scanner(System.in);
        while (true) {
            isCommandFound = false;
            String text = sc.nextLine();
            for (String commandName: commandHashMap.keySet())
                if (text.equals(commandName)) {
                    commandHashMap.get(commandName).run(dragonArrayList);
                    isCommandFound = true;
                }

            if (!isCommandFound)
                System.out.println("Unknown command " + text);
        }
    }

    private static HashMap<String, Command> createCommands(){
        HashMap<String, Command> commands = new HashMap<>();
        commands.put("add", new Add());
        commands.put("min by id", new MinById());
        commands.put("add if min", new AddIfMin());
        commands.put("remove all by type", new RemoveAllByType());
        commands.put("remove any by head", new RemoveAnyByHead());
        commands.put("remove by id", new RemoveById());
        commands.put("upgrade id", new UpdateId());
        commands.put("help", new Help());
        commands.put("show", new Show());
        commands.put("remove at", new RemoveAt());
        commands.put("exit",new Exit());
        commands.put("remove greater", new RemoveGreater());
        commands.put("save",new Save());
        commands.put("clear", new Clear());

        return commands;
    }

    private static String readFileIntoString(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        byte[] buffer = new byte[10];
        StringBuilder sb = new StringBuilder();
        while (fis.read(buffer) != -1) {
            sb.append(new String(buffer));
            buffer = new byte[10];
        }
        fis.close();

        return sb.toString();
    }
}