import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
      int a=3,b=8;
      System.out.print(a+" "+b+" ");
      for(int i=2;i<n;i++)
      {
        int c=a+b+i;
        System.out.print(c+" ");
        a=b;
        b=c;
      }
      
      
	}
}