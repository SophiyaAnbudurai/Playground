import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
          Scanner in = new Scanner(System.in);
	    int count = in.nextInt();

       int n1=0,n2=0,n3=1,i;    
 System.out.print(n1+" "+n2+" "+n3);//printing 0 and 1    
  int n4=0;  
 for(i=3;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  
   n4=n1+n2+n3;    
  System.out.print(" "+n4);  
   n1=n2;
  n2=n3;    
  n3=n4;    
 }    
    }
}