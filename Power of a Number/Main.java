import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
       int b = in.nextInt();
	    
        // fill your code
      int pow = 1; 
        for (int i = 1; i <= b; i++) 
            pow *= a; 
      System.out.println(pow);
    }
}