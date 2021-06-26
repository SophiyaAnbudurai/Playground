import java.util.Scanner;
class Main
{
   static int gcd(int a, int b)
    {
       
        if (a == 0)
          return b;
        if (b == 0)
          return a;
        if (a == b)
            return a;
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    public static void main(String args[])
    {
        //fill your code;
          Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
            int b = in.nextInt();
      
        System.out.println("G.C.D of " + a +" and " + b + " is " + gcd(a, b));
    }
}