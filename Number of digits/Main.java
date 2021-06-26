import java.util.Scanner;
class Main
{
  static int countDigit(int n)
    {
        if (n == 0)
            return 0;
        return 1 + countDigit(n / 10);
    }
 
    public static void main(String args[])
    {
        //fill your code;
          Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
        System.out.print("The number of digits in "+n+" is "+ countDigit(n));
    }
}