#include<iostream>
using namespace std;
bool prime(int n,int i)
{
if(n<=2)						
return (n==2)? true:false;	// Checking the value to be 2, if so it return true which means it’s a prime number if it’s any other value less than 2, returns false
if(n%i==0)
return false;		// If the number is divisible by any of the value of i, returns false so not a prime number
if(i*i>n)
return true;		// If the i square becomes greater than the number, then it return true
  return prime(n,i+1);	//Here we are making the recursive call by incrementing the value of i and the number remains the same to check for prime.
}
int main()
{
int n;
cin>>n;
if(prime(n,2))	// Call of our recursion function for checking prime number happens here
cout<<"Prime Number";
else
cout<<"Not a Prime Number";
}
