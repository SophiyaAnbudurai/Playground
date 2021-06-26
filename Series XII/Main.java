import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
      int a=9,b=11;
      int c=a+b;
      if(n==1)
      {
        System.out.print(a+" ");
      }
      else if(n==2)
      {
        System.out.print(a+" "+b);
      }
      else if(n==3)
      { 
        
        System.out.print(a+" "+b+" "+c);
      }
      else
      {
        System.out.print(a+" "+b+" "+c);
        for(int i=4;i<=n;i++)
        {
          int d=b;
          d=d+c;
          System.out.print(" "+d);
          b=c;
          c=d;
        }
      }
	}
}