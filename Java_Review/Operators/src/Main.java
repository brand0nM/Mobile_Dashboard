//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        a = a + 1;
        System.out.println(a);
        // equivalent to
        a ++;
        System.out.println(a);
        // equivalent to
        a += 1;
        System.out.println(a);
        // inverse
        a --;
        a -= 1;

        // Other
        a /= 2;
        System.out.println(a);
        a *= 2;
        System.out.println(a);

        // Logic Checks
        boolean b = a>10 || a==6;
        // Conditional Checks: Evaluates -> false && ...,
        // doesn't care since false, so no error thrown
        boolean c = a>10 && a==1/0;
        System.out.println(c);

        // Conditionals
        if (!c) {
            System.out.print("KeeperGoin\n");
        } else if (c) {
            System.out.print("Stahp\n");
        } else {
            System.out.print("Uhh");
        }

        // Loops
        for (int i=0; i>-20 ; i++){
            i-=7;
            System.out.print("yut");
        }
        double i = 2;
        while (i>0) {
            i = 0.9 * i - 0.1;
            if (i==1.43){
                System.out.print("gotst\n");
                continue;
            }
            System.out.println(i);
        }

        i = 2;
        do {
            i = 0.9 * i - 0.1;
            if (i==1.43){
                System.out.print("gotst\n");
                continue;
            }
            System.out.println(i);
        } while (i>0);

        Random random = new Random();
//        int number = random.nextInt(20) + 1;
        System.out.println(random);

    }
}