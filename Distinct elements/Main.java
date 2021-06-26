import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int[] arr=new int[n];
    int num=0;
    int j=0;
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      num=arr[i];
      if(num!=-999999990)
        for(j=i+1;j<n-1;j++)
        {
          if(num==arr[j])
          {
            arr[j]=-999999990;
          }
        }
    }
    j=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]!=-999999990)
      {
        j++;
      }
    }
    System.out.println(j);
  }
}
