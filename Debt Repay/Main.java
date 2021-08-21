#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
float p,n,r;
float si,a,d,f;
cin>>p>>n>>r;
si=(p*n*r)/100;
  a=p+si;
  d=si*0.02;
  f=a-d;
cout<<setprecision(2)<<fixed;
cout<<si<<endl;
cout<<a<<endl;
cout<<d<<endl;
cout<<f;
}
