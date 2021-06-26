#include<iostream>
using namespace std;
int main()
{
  float a,b;
  cout<<"Enter two numbers:"<<endl;
  cin>>a;
  cin>>b;
  if(b==0)
  {
    cout<<"Exception: Division by zero";
  }
  else
  {
  cout<<"a/b = "<<a/b;
  }
  return 0;
   //Type your code here..
}