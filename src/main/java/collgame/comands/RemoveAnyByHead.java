package collgame.comands;

import collgame.dto.Dragon;
import collgame.dto.DragonHead;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAnyByHead implements Command{
    public void run(ArrayList<Dragon> dragonArrayList){
        Scanner s = new Scanner(System.in);
        System.out.println("Write an amount of eyes");
        DragonHead headToRemove = new DragonHead(s.nextLong());
        for(Dragon dragon : dragonArrayList){
            if(dragon.getHead().compareTo(headToRemove) == 0){
                dragonArrayList.remove(dragon);
                break;
            }
        }
    }
}
