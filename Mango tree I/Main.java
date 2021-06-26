import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      int a,b,c;
      Scanner input=new Scanner(System.in);
      a=input.nextInt();
      b=input.nextInt();
      c=input.nextInt();
		if(c<a||c<b||b%c==0||c%b==0)
          System.out.print("Yes");
      else
        System.out.print("No");
	}
}