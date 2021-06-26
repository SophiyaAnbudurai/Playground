import java.util.*;
 class Main
 {
   public static void main(String args[])
   {
     Double n,avg; int i;
        double[] num=new double[20];double sum = 0.0;
      Scanner in=new Scanner(System.in);
     	n=in.nextDouble();
      for (i = 0; i < n; i++) 
      {
            num[i]=in.nextDouble();
            sum += num[i];
      }
        avg = sum / n;
        System.out.println("The mean of the array is "+String.format("%.2f",avg));
   }
 }