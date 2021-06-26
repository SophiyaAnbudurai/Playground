#include<iostream>
#include<cctype>
using namespace std;

int main()
{
  int n,a=1,sum=0;
  cin>>n;
  while(a<n)
  {
    if(n%a==0)
    
      sum=sum+a;
      a++;
    
  }
    if(sum==n)
    { cout<<"Yes";}
    else
    { cout<<"No";}
  //Type your code here
  return 0;
}