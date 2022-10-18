import java.util.List;

public class Human {
    private int key;
    private String value;

    public Human(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
}

class MyMAp {
    private List<Human> human;

    public void put(Integer key, String value) {
        human.add(new Human(key, value));
    }
}
