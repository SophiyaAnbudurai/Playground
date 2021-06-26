#include<iostream>
#include <bits/stdc++.h> 
using namespace std; 
class Dora
{ 
  int x;
    public: 
    Dora(int i)
    {
      cin>>i;
      x=i;
    }
  void operator+(Dora);
};
    void Dora :: operator+(Dora d) 
    { 
      
      int m = -(x+d.x);
      cout<<"value of n is: "<<m;
    }
 
  
int main() { 
     int i; 
    Dora s(i); 
    Dora s1(i);
 s+s1;
    return 0; 
}  