import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
        int a=11, num;
for(int i=0;i<n;i++)
{
   num=a*a;
   System.out.print(num+" ");
   a=a+4;

}
	}
}