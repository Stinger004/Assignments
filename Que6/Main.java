
package Que6;
import java.io.IOException;

public class Main {

        public static void main(String[] args)
        {
            Trycatch t1= new Trycatch();
            Trycatch t2= new Trycatch();

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Stopped !");
            }
        }

    }
