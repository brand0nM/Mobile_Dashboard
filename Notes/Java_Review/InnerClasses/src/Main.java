//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testClass test = new testClass(25, "Brown");
        test.setName("Brandon"); // Compiles, but can do without an instantiation of testClass
        testClass.name = "Brandon"; // i.e. access and set the class's attribute directly

    }
}