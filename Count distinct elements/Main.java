#include<iostream>
using namespace std;
int main()
{
  int n,count=0,i=0,j=0;
  
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(j=0;j<n;j++)
  {
    if(a[j]!=a[j+1])
    {
      count+=1;
    }
  }
  cout<<"There are "<<count<<" distinct element in the array.";
  
  //Type your code here.
}