#include <iostream> 
using namespace std; 
  
class Details
{ 
    public:
  string name,post;
int id,age,salary;
 
        void set(string n,int s,int t,int r,string g) 
        { 
          
            cin>>n>>s>>t>>r>>g;
          name = n;
          id = s;
          age = t;
          salary = r;
          post = g;
          
 cout<<"Enter the first name ="<<endl;
cout<<"Enter the identity number ="<<endl;
cout<<"Enter the age ="<<endl;
cout<<"Enter the salary ="<<endl;
cout<<"Enter the designation of the Engineer:"<<endl;

        } 
}; 
class Employee : public Details
{ 
    public: 

   void display() 
        { 
           cout<<"Displaying the particulars of the Engineer"<<endl;
              cout<<"Name = "<<name<<endl;
                 cout<<"Identity Number = "<<id<<endl;
                   cout<<"Age = "<<age<<endl;
                     cout<<"Salary = "<<salary<<endl;
                       cout<<"Designition = "<<post<<endl;
                          
        } 
};
int main()  
{ 
    Employee e; 
  string n,g;
  int s,t,r;

    e.set(n,s,t,r,g); 

    e.display(); 
    return 0; 
} 