public class Main {
    public static void main(String[] args) {
        Person tom = new Person(
                "Tom",
                25,
                new Eye("Left",
                        "Short Sighted",
                        true,
                        "Blue"),
                new Eye("Right",
                        "Normal",
                        true,
                        "Blue"),
                new Heart(
                        "Normal",
                        65),
                new Stomach(
                        "PUI"),
                new Skin(
                        "Burned")
        );
        tom.chooseOrgan();
    }
}
