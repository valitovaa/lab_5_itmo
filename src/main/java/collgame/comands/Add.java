package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;


public class Add implements Command {

    public void run(ArrayList<Dragon> dragonArrayList) {
        dragonArrayList.add(CreateDragon.createDragon());

    }


}
