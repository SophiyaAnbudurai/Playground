#include<iostream>
#include <string.h>
using namespace std;
int main()
{
 string s;
  cin>>s;
  int i;
  for ( i=0;i<s.length();i++)
  {
    int count=0;
    for (int j=0;j<s.length();j++)
    {
      if (s[i]==s[j])
        count++;
    }
    if (count==1)
    {
      cout<<s[i];
      break;
    }
  }
  if (i==s.length())
    cout<<"All the characters are repetitive"; 
}
