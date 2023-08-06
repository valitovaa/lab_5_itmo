package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAt implements Command{

    @Override
    public void run(ArrayList<Dragon> dragonArrayList) {
        System.out.println("Write index");
        int index = new Scanner(System.in).nextInt();
        dragonArrayList.remove(index);
    }
}
