package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;

public class Exit implements Command{
    @Override
    public void run(ArrayList<Dragon> dragonArrayList) {
        System.exit(0);
    }
}
