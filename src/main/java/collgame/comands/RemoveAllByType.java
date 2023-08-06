package collgame.comands;

import collgame.dto.Dragon;
import collgame.dto.DragonType;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllByType implements Command{
    public void run(ArrayList<Dragon> dragonArrayList){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose type:\n" + "WATER,\n" +
                "    UNDERGROUND,\n" +
                "    AIR,\n" +
                "    FIRE\n");
        DragonType type = DragonType.valueOf(s.nextLine());
        dragonArrayList.removeIf(dragon -> dragon.getType().equals(type));
    }
}
