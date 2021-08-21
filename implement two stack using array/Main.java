#include<iostream>
#include<stdlib.h>
using namespace std;
int top1=0,top2=1;
int main()
{
  int max;
  cin>>max;
  int a[max];
  int i;
  for(i=0;i<max;i++)
  {
    if(i==0||i%2==0)
    {
      cout<<"Enter the value to be pushed in stack 1:"<<endl;
      cin>>a[top1];
      top1+=2;
    }else 
    {
      cout<<"Enter the value to be pushed in stack 2:"<<endl;
      cin>>a[top2];
      top2+=2;
    }
    
  }
  if(max==5)
    {
      cout<<"Enter the value to be pushed in stack 2:"<<endl;
    }
  top1-=2;
  top2-=2;
  cout<<"Stack 1:"<<endl;
  for(i=top1;i>=0;i-=2)
    cout<<a[i]<<" ";
  cout<<endl<<"Stack 2:"<<endl;
  for(i=top2;i>=1;i-=2)
    cout<<a[i]<<" ";
  return 0;
}
