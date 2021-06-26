import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int l1,l2,l3;
      Scanner input=new Scanner(System.in);
      l1=input.nextInt();
      l2=input.nextInt();
      l3=input.nextInt();
      if(l1<l3&&l1<l2)
        System.out.print("L1");
      else if(l2<l3)
        System.out.print("L2");
      else
        System.out.print("L3");
    }
}