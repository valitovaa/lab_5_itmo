package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;
import java.util.Collections;

public class Show implements Command{


    @Override
    public void run(ArrayList<Dragon> dragonArrayList) {
        for (Dragon dr : dragonArrayList) {
            System.out.println(dr);
        }
        Collections.sort(dragonArrayList);
    }
}
