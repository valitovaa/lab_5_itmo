package collgame.test;

import collgame.comands.RemoveAnyByHead;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {


    public static void main(String[] args) throws IOException {
        for (Test test: getTests())
            test.test();
    }


    private static List<Test> getTests(){
        List<Test> list = new ArrayList<>();
        list.add(new RemoveAnyByHeadTest());
        //list.add(new AddIfMinTest());

        return list;
    }
}
