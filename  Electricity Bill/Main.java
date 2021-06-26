#include<iostream>
using namespace std;
int main()
{
  int a,c;
  string b;
  cin>>a>>b>>c;
  if(c<=100)
  {
    cout<<a<<endl<<b<<endl<<c<<endl<<c*1.20;
  }
  else if(c>100 && c<=300)
  {
    int d=c-100;
    cout<<a<<endl<<b<<endl<<c<<endl<<((100*1.20)+(d*2));
  }
  else if(c>300)
  {
    int d=c-100;
    int e=c-200;
    cout<<a<<endl<<b<<endl<<c<<endl<<((100*1.20)+(200*2)+(e*3));
  }
  
  
	
	return 0;
}