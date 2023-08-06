package collgame.comands;


import collgame.dto.Dragon;

import java.util.ArrayList;

import java.util.Scanner;

public class UpdateId implements Command{

    public void run(ArrayList<Dragon> dragonArrayList) {
        Scanner s = new Scanner(System.in);
        System.out.println("write an Id");
        Long id = s.nextLong();
        for (int i = 0; i < dragonArrayList.size(); i++) {
            if (dragonArrayList.get(i).getId() == id) {
                Dragon dragon = CreateDragon.createDragon();
                dragonArrayList.add(i, dragon);
            }
        }


    }
}
