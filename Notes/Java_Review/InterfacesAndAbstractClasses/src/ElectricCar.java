public class ElectricCar implements CarInterface{
    private String name;

    public ElectricCar(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }



    @java.lang.Override
    public void start() {
        System.out.println("The Car's Electricity Started");
    }

    @java.lang.Override
    public void move(int speed) {
        System.out.println(this.getName()+" is Moving at "+speed+" mph");
    }
}
