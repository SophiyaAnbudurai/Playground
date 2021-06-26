import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner in = new Scanner(System.in); 
        String string1 = in.nextLine(); 
        String string2 = in.nextLine(); 

        if (string1.equals(string2) == true) { 
            System.out.println("Strings are same"); 
        } 
        else { 
            System.out.println("Strings are not same"); 
        } 
	}
}