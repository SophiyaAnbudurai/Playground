#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int a[10],b[10],m,n,count;
cin>>n>>m;
for(int i=0;i<n;i++)
cin>>a[i];
for(int i=0;i<m;i++)
cin>>b[i];
for(int i=0;i<n;i++)
  {
if(a[i]==b[i])
count++;
  }
if(count==n)
cout<<"Same";
else
cout<<"Not Same";
}
