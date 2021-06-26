import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        
       Scanner in = new Scanner(System.in);
      int n1=0,n2=1,n3=0,i;
      int count=in.nextInt();;    
     
    
      for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed   
     {    
       n3=n1+n2;    
      
       n1=n2;    
       n2=n3;    
 }    
      System.out.println(n3); 
    }
}