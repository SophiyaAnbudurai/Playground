#include<iostream>
#include <bits/stdc++.h> 
using namespace std; 
class Area 
{ 
    public: 
    int z;
    void func(int x,int y) 
    { cin>>x>>y;
        cout  << x*y<< endl; 
     z=(x*y)*1/2;
     cout<< z <<endl;
    } 
      
  
}; 
  
int main() { 
      
    Area obj1; 
    int x,y;  
   
    obj1.func(x,y); 
 
    return 0; 
}  