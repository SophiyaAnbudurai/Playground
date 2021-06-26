#include<iostream>
using namespace std;
int main()
{
int hr,min,sec,hr1,min1,sec1;;

 cout<<"Enter time:"<<endl;
cin>>hr;
cout<<"Hours :"<<endl;
cin>>min;
cout<<"Minutes :"<<endl;
cin>>sec;
cout<<"Seconds :"<<endl;
cout<<"Enter time:"<<endl;
cin>>hr1;
cout<<"Hours :"<<endl;
cin>>min1;
cout<<"Minutes :"<<endl;
cin>>sec1;
cout<<"Seconds :"<<endl;
   int second=(sec+sec1)/60;
  int second1=(sec+sec1)%60;
  int minute=(min+min1+second)/60;
   int minute1=(min+min1+second)%60;
 int hour=hr+hr1+minute; 
cout<<"Time after add: "<<hour<<":"<<minute1<<":"<<second1; 
}