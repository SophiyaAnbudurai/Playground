import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
          Scanner in = new Scanner(System.in);
	   
      int n=0;
	   // System.out.println(a);
     double s=0;
 do
 {
   int a = in.nextInt();
   if(a%2 != 0 && a>0)

   {

     s=s+1;

     n=n+1;

   }

   else if(a%2==0&&a>0)

   {

     s=s-0.5;

   }

   else if(a<0)

   {

     s=s-1.0;

     break;

   }

   }while(n<3);

 System.out.println(s);

}
    }
