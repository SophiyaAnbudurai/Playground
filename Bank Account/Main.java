#include <iostream> 
using namespace std; 
  
class Details
{ 
    public:
  string name,acctype;
int accno,bal,dep,wdraw;
 
        void set(int a,string n,string t, int b,int d,int w) 
        { 
          cin>>a>>n>>t>>b>>d>>w;
          accno = a;
          name = n;
          acctype = t;
          bal = b;
          dep = d;
          wdraw = w;
          
        cout<<"Enter Details:"<<endl;
         cout<<"Accout No:"<<endl;
          cout<<"Name:"<<endl;
           cout<<"Account Type:"<<endl;
           cout<<"Balance:"<<endl;
            cout<<"Enter Deposit Amount ="<<endl;
              cout<<"Enter Withdraw Amount ="<<endl;

        } 
}; 
class Employee : public Details
{ 
    public: 

   void display() 
        { 
        int balance = ((bal+dep)-wdraw);
        if(balance <=0)
        {
        cout<<"Cannot Withdraw Amount"<<endl;
        }
        
 cout<<"Accout No: "<<accno<<endl;
cout<<"Name: "<<name<<endl;
cout<<"Account Type: "<<acctype<<endl;
cout<<"Balance: "<<balance<<endl;                
        } 
};
int main()  
{ 
    Employee e; 
  string n,t;
  int a,b,d,w;

    e.set(a,n,t,b,d,w); 

    e.display(); 
    return 0; 
} 