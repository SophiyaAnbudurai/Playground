#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
int total_balls,total_runs,runs_scored,balls_bowled;
cin>>total_balls>>total_runs>>runs_scored>>balls_bowled;
int overs=total_balls/6;
float overs_done=balls_bowled/6+(balls_bowled%6)*0.1;
float crr=runs_scored/overs_done;
float trr=(float)total_runs/overs;
cout<<overs<<endl;
cout<<fixed<<setprecision(1)<<overs_done<<endl;
cout<<setprecision(1)<<crr<<endl;
cout<<setprecision(1)<<trr<<endl;
if(crr>=trr)
cout<<"Eligible to Win";
else
cout<<"Not Eligible to Win";
return 0;
}
