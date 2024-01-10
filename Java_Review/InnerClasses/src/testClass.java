public class testClass {
    // Will not have an option to configure in constructor because static implies the name belongs to testClass its self
    // Does not belong to each unique instantiation
    private static String name;
    public int age;
    public String skinColor;


    // Constructor
    public testClass(int age, java.lang.String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }


    // Methods
    // e.x. can also be static
    public static void printDescription(){
        System.out.println(
                // vv Cant do this because it belongs to instances of this object
//                this.name+this.getAge()+this.getSkinColor()
                // Can do
                "I Like Goats "+this.name
        );
    }

    public static java.lang.String getName() {
        return name;
    }

    public static void setName(java.lang.String name) {
        testClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public java.lang.String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(java.lang.String skinColor) {
        this.skinColor = skinColor;
    }
}
