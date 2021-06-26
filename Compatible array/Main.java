import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code her
    int n,i=0;
    int c=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int [] a=new int[n];
    int [] b=new int[n];
    for (i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    for(i=0;i<n;i++)
    {
      b[i]=s.nextInt();
       if(a[i]<b[i])
         c=1;
    }
    if(c==0)
      System.out.println("Compatible");
    else
      System.out.println("Incompatible");
  }
}