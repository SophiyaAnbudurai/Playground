#include <iostream> 
using namespace std; 
  
class Student
{ 
    public: 
  int id,sub1,sub2; 
        void set(int x, int y,int z) 
        { 
          cin>>x>>y>>z;
          id=x;
            sub1 = y; 
            sub2 = z; 
        } 
}; 
class Marks : public Student
{ 
    public: 

   void display() 
        { 
           
            cout<<"Roll Number Is:"<<endl<<id<< endl; 
            cout<<"Subject 1:" <<sub1<<endl<<"Subject 2:"<<sub2<<endl; 
            cout<<"Total:"<<sub1+sub2;
        } 
};
int main()  
{ 
    Marks m; 
 int x,y,z;
    m.set(x,y,z); 

    m.display(); 
    return 0; 
} 