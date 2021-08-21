import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
          Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
         int powerRaised = in.nextInt();
        int result = power(base, powerRaised);

        System.out.printf("The value of "+base+" power "+powerRaised+" is "+ result);
    }

    public static int power(int base, int powerRaised) {
        if (powerRaised != 0)
            return (base * power(base, powerRaised - 1));
        else
            return 1;
    }
}