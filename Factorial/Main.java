import java.util.Scanner;
class Main
{
  static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
	    int number = in.nextInt();

       int fact=1;  
    
  for(int i=1;i<=number;i++){    
      fact=factorial(number);    
  }    
  System.out.println("The factorial of "+number+" is "+fact);    
    }
}