package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;
import java.util.Collections;

public class AddIfMin implements Command {

    public void run(ArrayList<Dragon> dragonArrayList) {
        Collections.sort(dragonArrayList);
        Dragon ourDragon = dragonArrayList.get(0);
        Dragon newDragon = CreateDragon.createDragon();
        if (newDragon.compareTo(ourDragon) < 0) {
            dragonArrayList.add(newDragon);
            System.out.println("The dragon was added");
        } else System.out.println("The dragon is too big");


    }
}
