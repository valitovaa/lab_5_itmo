package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;
import java.util.Collections;

public class Info implements Command{
    @Override
    public void run(ArrayList<Dragon> dragonArrayList) {
        dragonArrayList.getClass();

    }
}
