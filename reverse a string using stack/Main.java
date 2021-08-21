#include<iostream>
#include<string>
using namespace std;
int main()
{
  int top=-1;
  string st;
  cin>>st;
  int len=st.length();
  char stack[len];
  for(int i=0;i<len;i++)
    stack[++top]=st[i];
  for(int i=top;i>=0;i--)
    cout<<stack[i];
  return 0;
}
