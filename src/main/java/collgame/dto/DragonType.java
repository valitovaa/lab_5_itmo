package collgame.dto;

import java.io.Serializable;

public enum DragonType implements Serializable {
    WATER,
    UNDERGROUND,
    AIR,
    FIRE;

    @Override
    public String toString() {
        return "DragonType{}";
    }
}