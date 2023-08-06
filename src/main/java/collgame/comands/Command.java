package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;

public interface Command {

    void run(ArrayList<Dragon> dragonArrayList);

}
