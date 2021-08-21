#include<iostream>
using namespace std;
int main()
{
int hr,min,sec,hr1,min1,sec1;;


cin>>hr;

cin>>min;

cin>>sec;

cin>>hr1;

cin>>min1;

cin>>sec1;

   int second=(sec+sec1)/60;
  int second1=(sec+sec1)%60;
  int minute=(min+min1+second)/60;
   int minute1=(min+min1+second)%60;
 int hour=hr+hr1+minute; 
cout<<hour<<":"<<minute1<<":"<<second1; 
}