#include <iostream> 
using namespace std; 
  
class Color
{ 
    public:
int square,cube;
 
        void set(int s,int c) 
        { 
         

          cin>>s;
       
          cin>>c;
          square =s;
          cube = c;
         
        } 
}; 
class Cube : public Color
{ 
    public: 

   void display() 
        { 
          
           cout<<"Enter an integer number: ";cout<<"Square of "<<square<<" is: "<<square*square<<endl;
            cout<<"Enter an integer number: ";cout<<"Cube of "<<cube<<" is: "<<cube*cube*cube<<endl;

                   
        } 
};
int main()  
{ 
    Cube q; 
  int s,c;

    q.set(s,c); 

    q.display(); 
    return 0; 
} 