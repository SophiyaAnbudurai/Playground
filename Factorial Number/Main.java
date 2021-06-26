import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
          Scanner in = new Scanner(System.in);  
          int n=in.nextInt();
         for (int i = 1;; i++)
        {
            if (n % i == 0)
            {
                n /= i;
            }
            else
            {
                break;
            }
        }
     
        if (n == 1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
       }
}