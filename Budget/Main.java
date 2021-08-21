import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
       Scanner in = new Scanner(System.in);
	  
      float br =in.nextFloat();
       float vs = in.nextFloat();
      float as = in.nextFloat();
       float a = in.nextFloat();
      float l = in.nextFloat();      
  double tot=(br*350.34)+(vs*230.90)+(as*190.55)+(a*125.30)+(l*180.90);
if(tot<=15000)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
	}
}