import java.util.Scanner;

public class Person {
    // Attributes
    protected String name;
    protected int age;
    protected Eye leftEye;
    protected Eye rightEye;
    protected Heart heart;
    protected Stomach stomach;
    protected Skin skin;


    // Constructor's
    public Person(java.lang.String name,
                  int age,
                  Eye leftEye,
                  Eye rightEye,
                  Heart heart,
                  Stomach stomach,
                  Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    // Methods
    public void chooseOrgan() {
        // Display User Options
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("""
            Select An Organ:
                1) Left Eye
                2) Right Eye
                3) Heart
                4) Stomach
                5) Skin
                6) Quit""");

//        TODO !!BROKEN need a switch, dependent on users' input
//

        // Listen for User Input and Handle Event Accordingly
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                System.out.println(this.getLeftEye().getDescription());
                if (organChoice()) this.getLeftEye().changedTheEye();
                chooseOrgan(); break;
            case 2:
                System.out.println(this.getRightEye().getDescription());
                if (organChoice()) this.getRightEye().changedTheEye();
                chooseOrgan(); break;
            case 3:
                if (organChoice()) {
                    System.out.print(this.getHeart().getDescription() + "Enter Heart Rate: ");
                    Scanner heartScanner = new Scanner(System.in);
                    this.getHeart().setBpm(heartScanner.nextInt());
                } chooseOrgan(); break;
            case 4:
                System.out.println(this.getStomach().getDescription());
                if (organChoice()) this.getStomach().diguest();
                chooseOrgan(); break;
            case 5:
                System.out.println(this.getSkin().getDescription());
                chooseOrgan(); break;
            case 6:
                System.out.println("Enjoy You're Day!"); break;
            default:
                System.out.println("Invalid Selection");
                chooseOrgan(); break;
        }
    }
    public boolean organChoice() {
        Scanner orScan = new Scanner(System.in);
        Integer choic = orScan.nextInt(); System.out.println(choic);
        return choic == 1;
    }
    public Eye getLeftEye() {
        return leftEye;
    }
    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }
    public Eye getRightEye() {
        return rightEye;
    }
    public void setRightEye(Eye rightEye) {
        this.rightEye = rightEye;
    }
    public Heart getHeart() {
        return heart;
    }
    public void setHeart(Heart heart) {
        this.heart = heart;
    }
    public Stomach getStomach() {
        return stomach;
    }
    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }
    public Skin getSkin() {
        return skin;
    }
    public void setSkin(Skin skin) {
        this.skin = skin;
    }
    public java.lang.String getName() {
        return name;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
