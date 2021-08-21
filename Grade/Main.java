#include <iostream> 
using namespace std; 
  
class Student
{ 
    public:
  string name,gender,grade;
  int age,tmarks; 
        void set(string n,int x, string g,int y,string r) 
        { 
          cout<<"Enter student's basic information:"<<endl;  
         cout<<"Name:"<<endl;
         cout<<"Age:"<<endl;
           cout<<"Gender:"<<endl;

          cin>>n>>x>>g;
          cout<<endl<<"Enter student's result information:"<<endl;  
          cout<<"Total Marks:"<<endl;
           cout<<"Grade:"<<endl;
          cin>>y>>r;
          
          name=n;
          age=x;
          gender=g;
            tmarks= y; 
            grade = r; 
        } 
}; 
class Marks : public Student
{ 
    public: 

   void display() 
        { 
           int per=tmarks/5;
            cout<<"Name: "<<name<<endl; 
               cout<<"Age: "<<age<<endl;
                  cout<<"Gender: "<<gender<<endl;
                    cout<<"Total Marks: "<<tmarks<<endl;
                      cout<<"Percentage: "<<per<<endl;
                       cout<<"Grade: "<<grade<<endl;
        } 
};
int main()  
{ 
    Marks m; 
  string n,g,r;
 int x,y;
    m.set(n,x,g,y,r); 

    m.display(); 
    return 0; 
} 