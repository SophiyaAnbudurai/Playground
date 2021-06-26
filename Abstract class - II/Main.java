#include <iostream> 
using namespace std; 
  
class implementAbstraction 
{ 
 
  
    public: 
      int a;
        
        void set(int x) 
        { cin>>x;
            a = x; 
             
        } 
          
        void display() 
        { 
          cout<<"Base class constructor"<<endl;
            cout<<"Derived class constructor"<<endl;
            cout<<"The given input is "<<a<< endl; 
             
        } 
}; 
  
int main()  
{ 
    implementAbstraction obj; 
  int x;
    obj.set(x); 
    obj.display(); 
    return 0; 
} 