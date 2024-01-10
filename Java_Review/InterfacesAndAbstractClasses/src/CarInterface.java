public interface CarInterface {
    // If you try to define here, {}, will get error, cant define here
    // Also, public is redundant here since all definition in an abstract class are public.
//    void printName(String name);
    void start();
    void move(int speed);

}