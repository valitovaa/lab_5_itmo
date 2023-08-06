package collgame.dto;

import java.io.Serializable;
import java.util.Objects;

public class DragonHead implements Comparable<DragonHead>, Serializable {
    private long eyesCount;

    public DragonHead(long eyesCount) {
        this.eyesCount = eyesCount;
    }

    @Override
    public String toString() {
        return "DragonHead{" +
                "eyesCount=" + eyesCount +
                '}';
    }


    @Override
    public int compareTo(DragonHead o) {
        int res = (int) (this.eyesCount-o.eyesCount);
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DragonHead that = (DragonHead) o;
        return this.eyesCount == that.eyesCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eyesCount);
    }
}