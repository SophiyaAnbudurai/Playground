import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int a;
      String b;
      Scanner input=new Scanner(System.in);
      String c="front";
      String d="rear";
      b=input.next();
        a=input.nextInt();
     // System.out.print(a);
     if((b.compareTo("front")==0)&&a==0)
System.out.print("Right Handed");
 else if((b.compareTo("rear"))==0&&a==1)
System.out.print("Right Handed");
   else if((b.compareTo("FRONT")==0) && a==0)
     System.out.print("Right Handed");
 else if((b.compareTo("REAR")==0) && a==0)
System.out.print("Left Handed");
 else
System.out.print("Left Handed");
	}
}