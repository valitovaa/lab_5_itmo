package collgame.test.utils;

import collgame.comands.RemoveAnyByHead;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class SystemInWriter {


    public static void write(String s){
        byte[] byteArray = s.getBytes(StandardCharsets.UTF_8);
        InputStream testInput = new ByteArrayInputStream( byteArray );
        System.setIn(testInput);

    }
}
