import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        String a, b, c;
        Scanner s = new Scanner(System.in);
       // System.out.print("Enter first string:");
        a = s.nextLine();
       // System.out.print("Enter second string:");
        b = s.nextLine();
       // String_Concatenate obj = new  String_Concatenate();
       // c = obj.concat(a, b);
      c=a+b;
        System.out.println(c);
    }
    String concat(String x, String y)
    {
        String z;
        z = x + " " + y;
        return z;
    }
}