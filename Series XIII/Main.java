import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
     int i,t;
 for(i=1;i<=n;i++)
   {
   t=(11*i*i)-(22*i)+16;
  System.out.print(t+" ");
   }
	}
}