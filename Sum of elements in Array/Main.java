import java.util.Scanner;
class Main
{
  
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int number= in.nextInt(); 
      int[] array = new int[number];
      int sum = 0;
      //System.out.println("Enter the elements:");
      for (int i=0; i<number; i++)
      {
    	  array[i] = in.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("The sum of the elements in the array is "+sum);
    }
}