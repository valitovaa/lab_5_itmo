package collgame.dto;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Random;

public class Dragon implements Comparable<Dragon> , Serializable {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private String creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer age; //Значение поля должно быть больше 0, Поле может быть null
    private float weight; //Значение поля должно быть больше 0
    private DragonType type; //Поле может быть null
    private DragonCharacter character; //Поле может быть null
    private DragonHead head;

    public Dragon(String name, Coordinates coordinates, ZonedDateTime creationDate, Integer age, float weight, DragonType type, DragonCharacter character, DragonHead head) {
        this.id = new Random().nextLong();
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate.toString();
        this.age = age;
        this.weight = weight;
        this.type = type;
        this.character = character;
        this.head = head;
    }

    public DragonHead getHead() {
        return head;
    }

    public DragonType getType() {
        return type;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "collgame.dto.Dragon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", age=" + age +
                ", weight=" + weight +
                ", type=" + type +
                ", character=" + character +
                ", head=" + head +
                '}';
    }

    @Override
    public int compareTo(Dragon o) {
        return this.age-o.age;
    }
}