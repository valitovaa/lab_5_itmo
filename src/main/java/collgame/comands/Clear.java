package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;

public class Clear implements Command{
    @Override
    public void run(ArrayList<Dragon> dragonArrayList) {
        dragonArrayList.clear();
    }
}
