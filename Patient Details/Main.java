#include <iostream> 
using namespace std; 
  
class Details
{ 
    public:
  string name,gender,deptname,assignwork;
int id,time;
 
        void set(string n,int s,string g,string dn,string aw,int t) 
        { 
          
            cin>>n>>s>>g>>dn>>aw>>t;
        
          
          name = n;
          id = s;
          gender = g;
          deptname = dn;
          assignwork = aw;
          time = t;
          cout<<"Enter Data"<<endl;
cout<<"Enter Patient Name :"<<endl;
cout<<"Enter Bed Number :"<<endl;
cout<<"Enter Ward Name :"<<endl;
cout<<"Enter the Doctor Name :"<<endl;
cout<<"Enter Doctorate Degree :"<<endl;
cout<<"Enter Dues of Patient :"<<endl;

        } 
}; 
class Employee : public Details
{ 
    public: 

   void display() 
        { 
        cout<<"Inserted Data"<<endl;
              cout<<"Patient Name : "<<name<<endl;
                 cout<<"Bed Number : "<<id<<endl;
                   cout<<"Ward Name : "<<gender<<endl;
                     cout<<"Doctor Name : "<<deptname<<endl;
                       cout<<"Doctorate Degree : "<<assignwork<<endl;
                          cout<<"Total Dues of Patient : "<<time<<endl;    
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