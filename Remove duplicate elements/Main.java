#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int a[100],n,temp,i,j,k;
cin>>n;
for(int i=0;i<n;i++)
cin>>a[i];
for(i=0;i<n;i++)
    {
for(j = i+1; j < n; ) 
{
if(a[j] == a[i])
{ 
for(k = j; k < n; k++)
{ 
a[k] = a[k+1]; 
} 
n--; 
} 
else
{
j++;
}
} 
}
for(int i=0;i<n;i++)
cout<<a[i]<<endl;
}
