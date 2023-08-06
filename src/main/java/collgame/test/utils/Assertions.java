package collgame.test.utils;

public class Assertions {

    public static void assertThat(boolean assertion){
        if (!assertion)
            throw new RuntimeException("assertion was false");
    }
}
