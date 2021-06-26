import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		float q,s,d,gt; 
      Scanner input=new Scanner(System.in);
      s=input.nextFloat();
      d=input.nextFloat();
      gt=input.nextFloat();
       q=s/d;
  if(q<=gt)
    System.out.println("No");
      else
        System.out.println("Yes");
	}
}