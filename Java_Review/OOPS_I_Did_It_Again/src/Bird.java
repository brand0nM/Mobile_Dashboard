public class Bird extends Animal{
    int wings;


    public Bird(java.lang.String name, java.lang.String color, int legs, boolean hasTail, int wings) {
        super(name, color, legs, hasTail);
        this.wings = wings;
    }


    @java.lang.Override
    public void eat(java.lang.String food) {
        System.out.println("I'm Sick and Fliered of Eating");
    }
    // Another example of polymorphism vv
    public void fly() {
        System.out.println("I'm Fappin .. with an L.. but not just life.. or this joke");
    }
    public void fly(double speed) {
        System.out.println("Gon Fast"+Double.toString(speed));
    }

    public int getWings() {return wings;}
    public void setWings(int wings) {this.wings = wings;}
}
