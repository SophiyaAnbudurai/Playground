import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    int n,sumE=0,sumO=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(a[i]%2==0)
      {
        sumE=sumE+a[i];
      }
      else
      {
        sumO=sumO+a[i];
      }
    }
    System.out.println("The sum of the even numbers in the array is "+sumE);
    System.out.println("The sum of the odd numbers in the array is "+sumO);  
  }
}