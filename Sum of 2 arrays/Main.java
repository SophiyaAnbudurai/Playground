import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int n,c,i;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int [] a=new int[n];
      int [] b=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      for(i=0;i<n;i++)
      {
        b[i]=s.nextInt();
      }
      for(i=0;i<n;i++)
      {
      c=a[i]+b[i];
      System.out.println(c);
      }
    }
}