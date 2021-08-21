import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner(System.in);
	    double a = in.nextInt();
      double b=20.5;
      double start=95.0;
      if(a==1)
      {
        System.out.print(start+" ");
      }
      else
      {
        System.out.print(start+" ");
      for(int i=1;i<a;i++)
      {
        start=start+b;
        System.out.print(start+" ");
        b+=2.0;
      }
      
      }
      
	}
}