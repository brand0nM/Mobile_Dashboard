import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(60);
        ArrayList<String> names = new ArrayList<>();
    }
}