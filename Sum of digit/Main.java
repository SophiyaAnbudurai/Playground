# include<iostream> 
using namespace std; 
/* Function to get sum of digits */
class sum 
{ 
    public: 
    int getSum(int n) 
    {  
    int sum = 0; 
    while (n != 0) 
    { 
     sum = sum + n % 10; 
     n = n/10; 
    }  
 return sum; 
 } 
}; 
 
int main() 
{ 
 sum s; 
 int n;
  cin>>n;
 cout<< s.getSum(n); 
 return 0; 
} 