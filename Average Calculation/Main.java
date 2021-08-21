import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       float a,b,c,d,e;
      Scanner in=new Scanner(System.in);
      a=in.nextFloat();
      b=in.nextFloat();
      c=in.nextFloat();
      d=in.nextFloat();
      e=in.nextFloat();
      float f=(a+b+c+d+e)/5;
      System.out.printf("%.2f",f);
        // fill your code
    }
}