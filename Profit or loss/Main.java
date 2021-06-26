import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float cp,sp;
      float b,p,i;
  Scanner input=new Scanner(System.in);
      cp=input.nextFloat();
      sp=input.nextFloat();
  b=sp*12;
  if(cp>b)
  {
     p=cp-b;
   System.out.printf("Loss : Rs.%.2f",p);
  }
  else if(cp<b)
  {
    i=b-cp;
    System.out.printf("Profit : Rs.%.2f",i);
  }
  else 
  {
    System.out.printf("No profit nor loss");
  }
    }
}