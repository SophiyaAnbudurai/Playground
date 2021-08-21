import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner(System.in);
	    int rows = in.nextInt();
     int i, j;  
for (i = rows; i >= 1; i--)   
{  
for (j = 1; j <i*2; j++)  
{  
System.out.print(j+" ");  
}  
System.out.println();  
}  
	}
}