import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=0;
      while(n!=1)
      {
        System.out.println(n);
        if(n%2 == 1)
        {
          n=3*n+1;
          ++count;
        }
        else
        {
          n=n/2;
          ++count;
        }
      }
      System.out.println(n);
      System.out.println(count);
    }
}