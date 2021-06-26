#include <iostream> 
using namespace std; 
  
class Details
{ 
    public:
  string name,gender,deptname,assignwork;
int id,time;
 
        void set(string n,int s,string g,string dn,string aw,int t) 
        { 
          getline(cin,n);
            cin>>s>>g;
          cin.ignore(1);
          getline(cin,dn);
          getline(cin,aw);
          cin>>t;
          name = n;
          id = s;
          gender = g;
          deptname = dn;
          assignwork = aw;
          time = t;
          
          
         cout<<"Enter employee's basic info:"<<endl;
cout<<"Enter Name: Enter Emp. Id: Enter Gender: Enter employee's department info:"<<endl;
cout<<"Enter Department Name: Enter assigned work: Enter time in hours to complete work: Employee's Information is:"<<endl;
cout<<"Basic Information...:"<<endl;

        } 
}; 
class Employee : public Details
{ 
    public: 

   void display() 
        { 
              cout<<"Name: "<<name<<endl;
cout<<"Employee ID: "<<id<<endl;
cout<<"Gender: "<<gender<<endl;

cout<<endl<<"Department Information...:"<<endl;
cout<<"Department Name: "<<deptname<<endl;
cout<<"Assigned Work: "<<assignwork<<endl;
cout<<"Time to complete work: "<<time<<endl;    
        } 
};
int main()  
{ 
    Employee e; 
  string n,g,dn,aw;
  int s,t;

    e.set(n,s,g,dn,aw,t); 

    e.display(); 
    return 0; 
} 