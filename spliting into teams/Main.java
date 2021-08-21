import java.util.Scanner;
class Main
{
public static void main(String args[])
{
// fill your code
      Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
        int b = in.nextInt();
	    System.out.println("The number of students in each team is " + (a/b) + " and left out is " + (a%b));
}
}