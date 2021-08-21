import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int x1,y1,x2,y2;
    Scanner read=new Scanner(System.in);
    x1=read.nextInt();
    y1=read.nextInt();
    x2=read.nextInt();
    y2=read.nextInt();
    double a=(x1+x2)/2.0;
  double b=(y1+y2)/2.0;
    System.out.printf("Binoy's house is located at (%.1f,%.1f)",a,b); 
    // fill your code
  }
}