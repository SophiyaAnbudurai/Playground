#include<iostream>
using namespace std;
int main()
{
  string s1,s2;
  cin>>s1>>s2;
  int i =s2.find(s1);
  s2.erase(i,s1.size());
  cout<<s2;
  //Type your code here.
}