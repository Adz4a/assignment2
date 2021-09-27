import java.util.List;

public class User implements Observer{

    private String name;

    public User(String name) {
        this.name = name;
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Hello " + name + ". Today's weather:");
    }
}
