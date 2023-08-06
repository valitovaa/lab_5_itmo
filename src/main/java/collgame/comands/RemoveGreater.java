package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveGreater implements Command{
    @Override
    public void run(ArrayList<Dragon> dragonArrayList) {
        Dragon newDragon = CreateDragon.createDragon();
        dragonArrayList.removeIf(drag -> drag.compareTo(newDragon) > 0);
    }
}
