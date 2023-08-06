package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class RemoveById implements Command{
    public void run(ArrayList<Dragon> dragonArrayList) {
        Scanner s = new Scanner(System.in);
        System.out.println("write an Id");
        Long id = s.nextLong();
        int index = 0;
        for (int i = 0; i < dragonArrayList.size(); i++) {
            if (Objects.equals(dragonArrayList.get(i).getId(), id)) {
                index = i;
            }
        }
        dragonArrayList.remove(index);

    }
}
