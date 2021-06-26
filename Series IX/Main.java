import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
      int ith_term = 0;
     
    // Generate the ith term and
    for(int i = 1; i <= a; i++)
    {
       ith_term = (13 * i * (i - 1)) / 2 + 2;
       System.out.print(ith_term + " ");
    }
	}
}