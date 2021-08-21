import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
      double num=4,p=2;
      if(a==1)
      {
        System.out.print(num);
      }
      else
      {
         System.out.print((int)num);
        for(int i=1;i<a;i++)
        {
          double f=(num+(Math.pow(i,p)));
          System.out.print(" "+(int)f);
          num=f;
          
        }
      }
	}
}