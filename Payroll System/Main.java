#include <iostream> 
using namespace std; 
  
class Details
{ 
    public:
  string name,post;
int noemp,id,base,hraa,dept,pension,net;
  

        void set(int s,string n,string g,int bp,int hra,int da,int pf,int np) 
        { 
          
            cin>>noemp>>s>>n>>g>>bp>>hra>>da>>pf>>np;
        
          id = s;
     name = n;
          post = g;
   base = bp;
   hraa = hra;
   dept = da;
   pension = pf;
   net = np;
cout<<"Enter the number of employee:"<<endl;
cout<<"Enter the employee number:"<<endl;
cout<<"Enter the employee name:"<<endl;
cout<<"Enter the designation:"<<endl;
cout<<"Enter the basic pay:"<<endl;
cout<<"Enter the Humen Resource Allowance:"<<endl;
cout<<"Enter the Dearness Allowance :"<<endl;
cout<<"Enter the Profitablity Fund:"<<endl;
    net=(bp+hra+da)-pf;      
          

        } 
}; 
class Employee : public Details
{ 
    public: 

   void display() 
        { 
         cout<<"e_no 	 e_name	 des 	 bp 	 hra 	 da 	 pf 	 np"<<endl;
         cout<<id<<"\t"<<name<<"\t"<<post<<"\t"<<base<<"\t"<<hraa<<"\t"<<dept<<"\t"<<pension<<"\t"<<net;                  
        } 
};
int main()  
{ 
    Employee e; 
  string n,g;
  int s,bp,hra,da,pf,np;

    e.set(s,n,g,bp,hra,da,pf,np); 

    e.display(); 
    return 0; 
} 