//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Access modifiers
            // Defaults to Public: attribute, method and constructors can be access from anywhere
            // Private: Can only be accessed inside the class
            // Protected: Can only be viewed in same package and subclass

        Phone iPhone = new Phone("IPhone 11", 8);
//        iPhone.setName("IPhone 11");
        // Iphone Name is private so bellow will throw
            // java: name has private access in Phone
//        System.out.print(iPhone.name);
        iPhone.printName();
//        iPhone.memoryRam = 8;
//        iPhone.setMemoryRam(8);

        iPhone.playMusic("Fast Car", "Someone");
    }
}