import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
       int a=1,b=2,c=3;
      if(n==1)
      {
        System.out.print(a);
      }
      else if(n==2)
        {
        System.out.print(a+" "+b+".0 ");
      }
      else if(n==3)
      {
      System.out.print(a+" "+b+".0 "+c+".0 ");
      }
      else
      {
        System.out.print(a+" "+b+".0 "+c+".0 ");
      for(int i=4;i<=n;i++)
      {
        if(i%2==0)
        {
          int o=b*3;
           System.out.print(o+".0 ");
          b=o;
        }
        else
        {
          int e=c*3;
           System.out.print(e+".0 ");
          c=e;
        }
      }
      }
	}
}