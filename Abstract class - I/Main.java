#include <iostream> 
using namespace std; 
class rectangle
{ 
  public: 
      int a;
        void set(int x) 
        { 
            cin>>x;
            a = x; 
             
        } 
          
        void display() 
        { 
            cout<<"Rectangle"<<endl;
     cout<<"The given input is "<<a<< endl;
          cout<<"Circle"<<endl;
     cout<<"The given input is "<<a<< endl;     
            
        } 
}; 
  
int main()  
{  
    rectangle r; 
    int x;
    r.set(x); 
    r.display();
    
    return 0; 
} 