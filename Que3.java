import javax.naming.Name;
public class Que3 {
    public static void main(String[] args) {
        try {
            Class.forName("Ashish jha");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            System.out.println("This is catch block");
        }
    }
}


