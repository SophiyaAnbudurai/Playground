import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int k,n=0,r,s,sum1=0,sum2=0,c,temp,l,sum,a=1;
      Scanner io=new Scanner(System.in);
 k=io.nextInt();
 temp = k;
 s = k*k;
 do{
n++;
temp /= 10;
 }while(temp>0);
 for(c = 0; c < n; c++){
  r = s % 10;
  s = s/10;//8    
sum1 = sum1 + r*a;
a*=10;
 }
 a=1;
 while(s>0){
  r = s %10;
  s = s/10;
sum2 = sum2 +r*a;
a*=10;
 }
 sum  = sum1 + sum2;
 if(sum == k){
  System.out.print("Kaprekar Number");  
 }
 else{
  System.out.print("Not a Kaprekar Number");
 }  

    }
}