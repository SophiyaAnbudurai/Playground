import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      
        Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
      int b=3;
      System.out.print(b);
      for(int i=1;i<a;i++)
      {
        int pr=b*3;
        System.out.print(" "+pr);
        b=pr;
      }
	}
}