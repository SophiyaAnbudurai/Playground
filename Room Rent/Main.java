#include <iostream> 
using namespace std; 
  
class Amount
{ 
    public:
int nrent,ram,sathish;
 
        void set(int s, int f,int g) 
        { 
         

          cin>>s>>f>>g;
          nrent =s;
          ram =f;
          sathish =g;
        } 
}; 
class Rent : public Amount
{ 
    public: 

   void display() 
        { 
           int rent=(nrent-(ram+sathish));
           cout<<"The total amount of the rent is :"<<endl;
cout<<"Remaining money from Ram's salary:"<<endl;
cout<<"Remaining money from Sathish's salary:"<<endl;
cout<<"To pay the rent amount they need to arrange : "<<rent<<"Rs"<<endl;
                   
        } 
};
int main()  
{ 
    Rent r; 
  int s,f,g;

    r.set(s,f,g); 

    r.display(); 
    return 0; 
} 