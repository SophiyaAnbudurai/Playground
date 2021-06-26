import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	    Scanner in = new Scanner(System.in);
	    int x = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int profit = ((x*a)-(x*b))-100;
	    System.out.println("The profit obtained is Rs."+profit);
	}
}