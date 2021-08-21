import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int x,y,z,n;
      Scanner input=new Scanner(System.in);
      x=input.nextInt();
      y=input.nextInt();
      z=input.nextInt();
      n=input.nextInt();
        if(x>=n&&y>=n&&z>=n)
    System.out.print("3");
  else if(y>=n)
   System.out.print("2");
  else if(z>=n)
    System.out.print("1");
  else 
    System.out.print("0");
    }
}