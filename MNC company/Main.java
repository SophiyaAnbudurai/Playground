   #include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a,b;
  cout<<"Enter two numbers:"<<endl;
  cin>>a>>b;
  float c = ((float)a/(float)b);
  if(b==0)
  {
    cout<<"Exception: Division by zero";
  }
  else if(b<1&&b!=0)
  {
    cout<<"Exception: Division is less than 1";
  }
  else
  {
   
    cout<<"a/b = "<<c;
  }
  return 0;

}