import java.util.*;
public class Main
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
      String str =sc.nextLine();
     // System.out.println(str);
      str = str.replaceAll("[AaEeIiOoUu]", "");
      System.out.println(str);
   }
}