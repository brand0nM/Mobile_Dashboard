public class Animal {
    private String name;
    private String color;
    private int legs;
    private boolean hasTail;


    // Constructors:
    // Having multiple ways to instaiate the same object is a biproduct of polymorphism
    public Animal(java.lang.String name, java.lang.String color, int legs, boolean hasTail) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTail = hasTail;
    }
    public Animal(java.lang.String name, java.lang.String color, int legs) {
        this.name = name;
        this.color = color;
        this.legs = legs;
    }

    public void eat (String food) {
        System.out.println("Eating "+food);
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
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public boolean isHasTail() {
        return hasTail;
    }
    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
