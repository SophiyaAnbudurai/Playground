import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
        Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
        int b = a/10;
        int c = a%10;
        int d= b+c;
	    System.out.println("Alice must go in path-" + d);
	}
}