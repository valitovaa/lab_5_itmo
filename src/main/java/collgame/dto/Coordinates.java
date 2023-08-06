package collgame.dto;

import java.io.Serializable;

public class Coordinates implements Serializable {
    private float x; //Значение поля должно быть больше -994
    private long y;

    public Coordinates(float x, long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}