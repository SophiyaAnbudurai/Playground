#include <iostream> 
using namespace std; 
  
class Blood
{ 
    public:

 
        void set(string s, string f,string g) 
        { 
         

          cin>>s>>f>>g;
          
        } 
}; 
class Relation : public Blood
{ 
    public: 

   void display() 
        { 
           
            cout<<"Enter the son name:"<<endl; 
               cout<<"Enter the father name:"<<endl;
                  cout<<"Enter the grand parent name:"<<endl;
                   
        } 
};
int main()  
{ 
    Relation r; 
  string s,f,g;

    r.set(s,f,g); 

    r.display(); 
    return 0; 
} 