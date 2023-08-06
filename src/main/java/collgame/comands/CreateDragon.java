package collgame.comands;

import collgame.dto.*;

import java.io.Console;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CreateDragon {
    public static Dragon createDragon() throws InputMismatchException {
        Scanner s = new Scanner(System.in);
        System.out.println("write a Dragon name:");
        String name;
        while (true) {
            name = s.nextLine();
            if (name == null || name.equals("")) {
                System.out.println("Try another name");
                continue;
            }
            break;
        }

        Long id = new Random().nextLong();
        System.out.println("write a coordinate x:");
        float x;
        while (true) {
            try {
                x = Float.parseFloat(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("x should be float");
                continue;
            }
            if(x < -995){
                System.out.println("x should be bigger that -993");
                continue;
            }
            break;
        }
        //L.O.B.S.T.E.r.4
        //float x = s.nextFloat();
        System.out.println("write a coordinate y:");
        long y;
        while (true){
            try {
                y = Long.parseLong(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("y should be long");
                continue;
            }
            break;
        }
        Coordinates coord = new Coordinates(x, y);
        System.out.println("write a Dragon's age:");
        int age;
        while (true){
            try {
                age = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("age should be integer");
                continue;
            }
            if(age < 0){
                System.out.println("age should be bigger than 0");
                continue;
            }
            break;
        }
        System.out.println("How much does your dragon weights? ");
        float weight;
        while (true){
            try {
                weight = Float.parseFloat(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("age should be integer");
                continue;
            }
            if(weight < 0){
                System.out.println("weight should be bigger than 0");
                continue;
            }
            break;
        }
        System.out.println("""
                Choose his type:
                    WATER,
                    UNDERGROUND,
                    AIR,
                    FIRE
                """);
        s.nextLine();
        DragonType dragonType;
        while (true){
            try{
                dragonType = DragonType.valueOf(s.nextLine());
            }catch (IllegalArgumentException e){
                System.out.println("wrong type");
                continue;
            }
            break;
        }
        System.out.println("""
                Choose dragons character
                    CUNNING,
                    WISE,
                    GOOD,
                    CHAOTIC_EVIL;
                """);
        DragonCharacter dragonCharacter;
        while (true){
            try{
                dragonCharacter = DragonCharacter.valueOf(s.nextLine());
            }catch (IllegalArgumentException e){
                System.out.println("wrong type");
                continue;
            }
            break;
        }
        System.out.println("How many eyes does dragon has?");

        long eyesCount;
        while (true){
            try {
                eyesCount = Long.parseLong(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("amount of eyes should be long");
                continue;
            }
            break;
        }
        DragonHead dragonHead = new DragonHead(eyesCount);
        return new Dragon(name, coord, ZonedDateTime.now(), age, weight, dragonType, dragonCharacter, dragonHead);
    }
}
