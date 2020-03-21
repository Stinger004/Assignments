package Que6;

public class Trycatch extends Thread {

    int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(count++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // System.out.println(count);
}
