import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
          Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
      int b = in.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      
	    System.out.println(a);
      System.out.println(b);

    }
}