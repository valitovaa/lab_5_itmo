package collgame.comands;

import collgame.dto.Dragon;
import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class Save implements Command{
    @Override
    public void run(ArrayList<Dragon> dragonArrayList) {
        Gson gson = new Gson();

        String jsonDocument = gson.toJson(dragonArrayList);
        System.out.println(jsonDocument);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("save.json");
            fileOutputStream.write(jsonDocument.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test.csv"))) {
//
//            for(Dragon dragon: dragonArrayList){
//                outputStream.writeObject(dragon);
//            }
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }

    }
}
