package collgame.comands;

import collgame.dto.Dragon;

import java.util.ArrayList;
import java.util.HashMap;

public class Help implements Command{

    private static HashMap<String, String> commands = new HashMap<>();

    public Help() {
        commands.put("help", "вывести справку по доступным командам");
        commands.put("exit", "завершить программу (без сохранения в файл)");
        commands.put("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        commands.put("add", "добавить новый элемент в коллекцию");
        commands.put("clear", "очистить коллекцию");
        commands.put("update id", "обновить значение элемента коллекции, id которого равен заданному");
        commands.put("remove by id", "удалить элемент из коллекции по его id");
        commands.put("remove at", "удалить элемент, находящийся в заданной позиции коллекции");
        commands.put("min by id","вывести любой объект из коллекции, значение поля id которого является минимальным");
        commands.put("remove all by type","удалить из коллекции все элементы, значение поля type которого эквивалентно заданному");
        commands.put("remove any by head","удалить из коллекции один элемент, значение поля head которого эквивалентно заданному");
        commands.put("add if min","добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции");
        commands.put("remove greater","удалить из коллекции все элементы, превышающие заданный");
        commands.put("save","сохранить коллекцию в файл");
    }

    @Override
    public void run(ArrayList<Dragon> dragonArrayList) {
        for (String key : commands.keySet()) {
            String value = commands.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
