import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
          Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
      int b=0;
      int count =0;
	    //System.out.println(a);
     
 while (a != 0)

   {

       a /= 10;

       ++count;

   }

   if(count!=3)

   {

     System.out.println ("Not a Trendy Number");

   }

   else

   {

       b = (a / 10) % 10 ;   // b has the middle number now.

       if(b%3==0)

       {

          System.out.println("Trendy Number");

       }

       else

       {

        System.out.println("Not a Trendy Number");  

       }

   }


    }
}