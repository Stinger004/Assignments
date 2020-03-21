public class Que13 {
    public static void main(String[] args)
    {
        try
        {
            throw new customException("Ashu");
        }
        catch(customException CE)
        {
            System.out.println("caught");
            CE.printStackTrace();
        }

    }
}

class customException extends Exception
{
    customException(String name)
    {
        super(name);
    }
}
