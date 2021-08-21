import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner(System.in);
	    int rows = in.nextInt();
     //int i, j;  
      int count =2;
     for(int i=0; i<rows; i++)   
    {   
        for(int j=0; j<=i; j++)   
       {   
          System.out.print((count%2)+" ");   
          count++;
       }   
     System.out.println();   
    }
	}
}