package collgame.test;

import collgame.comands.Command;
import collgame.comands.RemoveAnyByHead;
import collgame.dto.*;
import collgame.test.utils.SystemInWriter;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;

import static collgame.test.utils.Assertions.assertThat;

public class RemoveAnyByHeadTest implements Test{

    public void test() throws IOException {
        shouldRemoveOne();
    }

    void shouldRemoveOne() throws IOException {
        var littleDragonWithTwoEyes = new Dragon( "bantic", new Coordinates(1, 1), ZonedDateTime.now(), 4,
        10, DragonType.AIR, DragonCharacter.GOOD, new DragonHead(2));
        var dragonWithTwoEyes = new Dragon( "rebenok", new Coordinates(1, 1), ZonedDateTime.now(), 4,
                10, DragonType.AIR, DragonCharacter.GOOD, new DragonHead(2));
        var evilSpider = new Dragon( "rebenok", new Coordinates(1, 1), ZonedDateTime.now(), 4,
                10, DragonType.AIR, DragonCharacter.GOOD, new DragonHead(8));

        ArrayList<Dragon> list = new ArrayList<>();
        list.add(littleDragonWithTwoEyes);
        list.add(dragonWithTwoEyes);
        list.add(evilSpider);

        Command command = new RemoveAnyByHead();

        assertThat(list.size() == 3);
        SystemInWriter.write("2");
        command.run(list);

        assertThat(list.size() == 2);

        System.out.println("RemoveAnyByHead - successfully");
    }

}
