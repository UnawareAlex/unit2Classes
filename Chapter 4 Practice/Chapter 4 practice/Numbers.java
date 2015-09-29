import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number between 1,000 and 999,999: ");
        String str = s.next();
        if (str.length > 5)
        {
            String sub = str.substring(0, 3);
            String sub2 = str.substring(4);
            String sub3 = sub + sub2;
        }
        
        if (str.length > 4)
        {
            String sub = str.substring(0, 2);
            String sub2 = str.substring(3);
            String sub3 = sub + sub2;
        }
        
        else
        {
            String sub = str.substring(0);
            String sub2 = str.substring(2);
            String sub3 = sub + sub2;
        }
        
        System.out.println(sub3);
    }
}
            
       
        