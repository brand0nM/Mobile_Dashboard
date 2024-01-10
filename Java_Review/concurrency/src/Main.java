//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable () {
            @java.lang.Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Hello From Another Thread"+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        thread.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("Main Thread"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}