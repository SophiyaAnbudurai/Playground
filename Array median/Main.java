import java.util.*;
 class Main
 {
   public static double findMean(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];
 
        return (double)sum / (double)n;
    }
 
    // Function for calculating median
    public static double findMedian(int a[], int n)
    {
        // First we sort the array
        Arrays.sort(a);
 
        // check for even case
        if (n % 2 != 0)
            return (double)a[n / 2];
 
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.00;
    }
 
    // Driver code
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
        // Function call
        System.out.println("The median of the array is " + findMedian(a, n)+"0");
    }
}