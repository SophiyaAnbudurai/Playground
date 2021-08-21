import java.util.Scanner;
class Main
{
     
      static int sum_of_digit(int n) 
    {  
        if (n == 0) 
            return 0; 
        return (n % 10 + sum_of_digit(n / 10)); 
    } 
  
    public static void main(String args[]) 
    { 
          Scanner in = new Scanner(System.in);
	    int num = in.nextInt(); 
        int result = sum_of_digit(num); 
        System.out.println("The sum of digits in " + num + " is " + result); 
    }
}