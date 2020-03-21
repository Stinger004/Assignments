public class Que5 {
        int x,y;Que5() {
            x = 10;
            y = 20;
        }
    }
    class main{
        public static void main(String[] args)
        {
            Que5 ob1=new Que5();
            System.out.println(ob1.x + "   " + ob1.y);
            Que5 ob2 =ob1;
            ob2.x = 100;

            System.out.println(ob1.x + "   " + ob1.y);
            System.out.println(ob2.x + "   " + ob2.y);
        }
    }


