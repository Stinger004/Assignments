import java.util.Scanner;

public class Que7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter second");
        int sec = input.nextInt();
        int day = sec /(24*3600);
        sec = sec % (24 *3600);
        int hour = sec / 3600;
        sec %=3600;
        int miniutes = sec / 60;
        sec %=60;
        int seconds = sec;
        System.out.println(day + " " + "days \n" + hour + " " + "hours \n" + miniutes + " " + "miniutes \n"
                + seconds + " " + "seconds ");

    }
}


