import java.util.*;
class Main
{
  static int getMin(int arr[], int n)
  {
    int res=arr[0];
    for(int i=1;i<n;i++)
      res=Math.min(res,arr[i]);
    return res;
  }
  static int getMax(int arr[],int n)
  {
    int res=arr[0];
    for(int i=1;i<n;i++)
      res=Math.max(res,arr[i]);
    return res;
  }
  static void Range(int arr[],int n)
  {
    int max=getMax(arr,n);
    int min=getMin(arr,n);
    int range=max-min;
    System.out.println("The range of the array is "+range);
  }
  public static void main(String args[])
  {
    //type your code here
    int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    int [] b=new int[a];
    for(int i=0;i<a;i++)
    {
      b[i]=s.nextInt();
    }
    int n=b.length;
    Range(b,n);
  }
}