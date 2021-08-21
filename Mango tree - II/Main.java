#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;
  cin>>r>>c>>t;
  if(t<=r || t%r==1 || t>(c-1)*r && t<=c*r)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}