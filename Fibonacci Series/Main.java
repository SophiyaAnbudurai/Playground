import java.util.Scanner;
class Main
{
  static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         //System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    
    public static void main(String args[])
    {
        //fill your code;
      Scanner in=new Scanner(System.in);
       int count=in.nextInt();    
  //System.out.print(n1+" "+n2);//printing 0 and 1    
  printFibonacci(count-2);
     System.out.print("The term "+count+" in the fibonacci series is "+n3); 
    }
}