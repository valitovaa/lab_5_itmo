package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;

public class MinById implements Command{

    public void run(ArrayList<Dragon> dragonArrayList) {
        Long minId = Long.MAX_VALUE;
        //int index = 0;
        int index = 0;
        for (int i = 0; i < dragonArrayList.size(); i++) {
            if (dragonArrayList.get(i).getId() < minId) {
                minId = dragonArrayList.get(i).getId();
                index = i;
            }

        }
        System.out.println(dragonArrayList.get(index));
    }

}
