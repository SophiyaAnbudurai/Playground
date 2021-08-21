#include <bits/stdc++.h> 
  
using namespace std; 
class Rect 
{ 
    public: 
      int a;
   
    void func(int x,int y) 
    { 
      cin>>x>>y;
      a = 2*(x+y);
        cout<<"Perimeter of rectangle: "<< a<< endl; 
    } 
      
    
}; 
class Circ 
{ 
    public: 
      
   
    void func(int z) 
    { 
      cin>>z;
        cout<<"Perimeter of circle: "<< (float)(2*(3.14*z))<< endl; 
    } 
      
    
}; 
  
int main() { 
      
    Rect obj1; 
int x,y,z;
    obj1.func(x,y); 
     Circ obj2;
  obj2.func(z);
  
   
    return 0; 
}  