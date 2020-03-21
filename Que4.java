public class Que4 {
        private static Que4 myobj;
        static{
            myobj = new Que4 ();
        }
        private Que4 (){
        }
        public static  Que4  getInstance(){
            return myobj;
        }
        public void testMe()
        {
            System.out.println("Hey......it is working");
        }
        public static void main(String[] agrs)
        {
            Que4  ms = getInstance();
            ms.testMe();
        }
    }


