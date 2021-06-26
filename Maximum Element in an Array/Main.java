import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int n,i,temp;
      Scanner s = new Scanner (System.in);
      n=s.nextInt();
      int [] a=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      for(i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(a[i]>a[j])
          {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
        }
        
      }
      System.out.println(a[n-1]+" is the maximum element in the array");
      
    }
}