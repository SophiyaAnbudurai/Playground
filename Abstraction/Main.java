#include <iostream> 
using namespace std; 
  
class implementAbstraction 
{ 
   
  
    public: 
  int a,b;
      
        // method to set values of  
        // private members 
        void set(int x, int y) 
        { 
          cin>>x>>y;
            a = x; 
            b = y; 
        } 
          
        void display() 
        { 
            cout<<"a = " <<a << endl; 
            cout<<"b = " <<b << endl; 
        } 
}; 
  
int main()  
{ 
    implementAbstraction obj; 
 int x,y;
    obj.set(x,y); 

    obj.display(); 
    return 0; 
} 