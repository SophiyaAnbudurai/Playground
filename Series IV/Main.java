import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
      double start = 0.5;
while(n-- != 0)
{
   System.out.print(start+" ");
   start *= 3;
}
	}
}