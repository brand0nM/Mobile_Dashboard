//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Car mini = new Car(
//                "Mini Cooper",
//                "Red",
//                2,
//                new Engine("Paceman Sport", 8000)
//        );
//        System.out.println(mini.getName());

//        Car mini = null;
//        if (mini != null) {
//            mini.getColor();
//        }

        final int a = 1;
        // Can not assign value to final variable
//        a++;
        final Engine engine = new Engine("Pacemane Sport", 8000);
        // Can not Resolve print(void)
//        System.out.print(engine.setRpm(1000));
        // Can still
        new Car("Mini Cooper", "Red", 4, engine);
    }
}