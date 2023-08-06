package collgame.dto;

import java.io.Serializable;

public enum DragonCharacter implements Serializable {
    CUNNING,
    WISE,
    GOOD,
    CHAOTIC_EVIL;

    @Override
    public String toString() {
        return "DragonCharacter{}";
    }
}