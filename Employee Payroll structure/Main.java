#include<iostream>
using namespace std;
struct emp
{
int id,bs,hra,da,ma,pf,ins;
string name;  
};
int main()
{
//So after creating a structure we need to get the inputs for the particular structure and need print it clearly.
int n,pid;
cout<<"Enter the number of employees:"<<endl;
cin>>n;
cout<<"Enter your input for every employee:"<<endl;
struct emp e[n];
for(int i=0;i<n;i++)
  {
cout<<"Employee ID: "<<endl;
cin>>e[i].id;
cout<<"Employee Name: "<<endl;
cin>>e[i].name;
cout<<"Basic Salary, HRA: "<<endl;
cin>>e[i].bs;
cin>>e[i].hra;
cout<<"DA, Medical Allowance: "<<endl;
cin>>e[i].da;
cin>>e[i].ma;
cout<<"PF and Insurance: "<<endl;
cin>>e[i].pf;
cin>>e[i].ins; 
  }
cout<<"Enter employee ID to get payslip: "<<endl;
cin>>pid;
for(int i=0;e[i].id==pid;i++)
  {
cout<<"Salary Slip of "<<e[i].name<<endl;
cout<<"Employee ID: "<<e[i].id<<endl;
cout<<"Basic Salary: "<<e[i].bs<<endl;
cout<<"House Rent Allowance: "<<e[i].hra<<endl;
cout<<"Dearness Allowance: "<<e[i].da<<endl;
cout<<"Medical Allowance: "<<e[i].ma<<endl;
cout<<"Gross Salary: 75600 Rupees"<<endl;
cout<<"Deductions:"<<endl;
cout<<"Provident fund: 1000"<<endl<<"Insurance: 400"<<endl<<"Net Salary: 58800 Rupees"<<endl;
  }
}
