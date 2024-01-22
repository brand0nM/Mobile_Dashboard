//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Database db = Database.getInstance("");
        System.out.println(db.toString());
//        Database db = new Database("d");
    }
}