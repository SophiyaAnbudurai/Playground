import java.util.Scanner;
class Main
{
  static void SumOfEven(int arr[],     
                      int i, int sum) 
{ 
  
    // If current index is invalid i.e. all 
    // the elements of the array 
    // have been traversed 
    if (i < 0)  
    { 
  
        // Print the sum 
        System.out.print("Sum of even numbers "+sum); 
        return; 
    } 
  
    // If current element is even 
    if ((arr[i]) % 2 == 0) 
    { 
  
        // Add it to the sum 
        sum += (arr[i]); 
    } 
  
    // Recursive call for the next element 
    SumOfEven(arr, i - 1, sum); 
} 
  
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
        int n= in.nextInt(); 
      int[] array = new int[n];
     
      for (int i=0; i<n; i++)
      {
    	  array[i] = in.nextInt();
      } 
    int sum = 0;
     
    SumOfEven(array, n - 1, sum); 
    }
}