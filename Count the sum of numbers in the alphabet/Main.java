#include<iostream>
#include "string.h"
#include "bits/stdc++.h"
using namespace std;
int main()
{
  string s,temp="";
  getline(cin,s);
   int sum = 0; 
  for (int i=0;i<s.length();i++)
  {
    if (isdigit(s[i])) 
            temp += s[i]; 
     else
        { 
            sum += atoi(temp.c_str()); 
            temp = ""; 
        } 
  }
  sum =sum + atoi(temp.c_str()); 
 cout<<sum;
}
