import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
      int a=2;
      System.out.print(a+ " ");
      for(int i=1;i<n;i++)
      {
        int b=(a*2)+1;
        System.out.print(b+ " ");
        a=b;
      }
	}
}