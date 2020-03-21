public class Que2 {
    public static void main(String[] args)
    {
        String str ="ashu";
        char temp = 0;
        char[] str1 = str.toCharArray();
        for(int i=0;i<str1.length;i++)
        {
            for(int j=0;j<str1.length;j++)
            {
                if(str1[j] > str1[i])
                {
                    temp = str1[i];
                    str1[i]=str1[j];
                    str1[j]=temp;
                }

            }
        }

        for(int k=0;k<str1.length;k++)
        {
            System.out.println(str1[k]);
        }
    }
}
