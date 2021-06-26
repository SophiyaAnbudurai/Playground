import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int x1,y1,r1,x2,y2,r2;
      	Scanner io=new Scanner(System.in);
      		x1=io.nextInt();
      		y1=io.nextInt();
      		r1=io.nextInt();
      		x2=io.nextInt();
      y2=io.nextInt();
      r2=io.nextInt();
      	int r=r1+r2;
      	double d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
     // System.out.println((int)d);
      //System.out.println(r);
      if((int)d>r)
        System.out.print("Do not overlap");
      else if((int)d==r)
        System.out.print("Tangential");
      else
        System.out.print("Overlap");
	}
}