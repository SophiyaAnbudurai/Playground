#include <iostream> 
using namespace std; 
  
class Color
{ 
    public:
int cube;
 
        void set(int s) 
        { 
         
cout<<"Enter the side :"<<endl;
          cin>>s;
          cube =s;
         
        } 
}; 
class Cube : public Color
{ 
    public: 

   void display() 
        { 
           int sq=cube*cube;
           int cu=sq*cube;
           cout<<"The square value is : "<<sq<<endl;
            cout<<"The cube value is : "<<cu<<endl;

                   
        } 
};
int main()  
{ 
    Cube c; 
  int s;

    c.set(s); 

    c.display(); 
    return 0; 
} 