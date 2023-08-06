package collgame.test;

import collgame.comands.AddIfMin;
import collgame.dto.*;
import collgame.test.utils.Assertions;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class AddIfMinTest implements Test{

    @Override
    public void test() throws IOException {
        var evilSpider = new Dragon( "rebenok", new Coordinates(1, 1), ZonedDateTime.now(), 4,
                10, DragonType.AIR, DragonCharacter.GOOD, new DragonHead(8));
        ArrayList<Dragon> list = new ArrayList<>();
        list.add(evilSpider);

        AddIfMin command = new AddIfMin();

        Assertions.assertThat(list.size() == 1);
        command.run(list);
        Assertions.assertThat(list.size() == 2);
        command.run(list);
        Assertions.assertThat(list.size() == 2);
        System.out.println("RemoveAnyByHead - successfully");
    }
}
