import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
     int i,pr=6,diff=5;
    for(i=1;i<=n;i++)
    {
        System.out.print(pr+" ");
        pr=pr+diff;
        diff=diff+5;
    }
	}
}