#include<iostream>
using namespace std;
struct student
{
  int rn,sub[5],tot,grade;
  float avg;
};
int main()
{
  int i,n,j;
  struct student s[20];
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  cout<<"Enter the no of students"<<endl;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>s[i].rn;
    cin>>s[i].sub[0]>>s[i].sub[1]>>s[i].sub[2]>>s[i].sub[3]>>s[i].sub[4];
    s[i].tot=(s[i].sub[0]+s[i].sub[1]+s[i].sub[2]+s[i].sub[3]+s[i].sub[4]);
    s[i].avg=s[i].tot/5;
    if(s[i].avg>70)
    {
      s[i].grade=1;
    }
    else if(s[i].avg>=50&&s[i].avg<=70)
    {
      s[i].grade=2;
    }
    else
    {
      s[i].grade=3;
    }
  } 
  cout<<"rn s1 s2 s3 s4 s5 avg grade"<<endl;
  for(i=0;i<n;i++)
  {
    cout<<s[i].rn<<" "<<s[i].sub[0]<<" "<<s[i].sub[1]<<" "<<s[i].sub[2]<<" "<<s[i].sub[3]<<" "<<s[i].sub[4]<<" "<<s[i].avg<<" "<<s[i].grade;
    cout<<endl;
  }
}