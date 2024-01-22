public class Car {
    private String name;
    private String color;
    private int doors;
    private Engine engine;


    public Car(java.lang.String name, java.lang.String color, int doors, Engine engine) {
        this.name = name;
        this.color = color;
        this.doors = doors;
        this.engine = engine;
    }


    public java.lang.String getName() {
        return name;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }
    public java.lang.String getColor() {
        return color;
    }
    public void setColor(java.lang.String color) {
        this.color = color;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
