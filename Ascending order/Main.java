#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int a[10],n,temp;
cin>>n;
for(int i=0;i<n;i++)
cin>>a[i];
cout<<"Sorted array is:"<<endl;
for(int i=0;i<n;i++)
 {
for(int j=0;j<n;j++)
    {
if(a[i]<a[j]) //3,2,1
      {
temp=a[i];
a[i]=a[j];
a[j]=temp;
      }
    }
  }
for(int i=0;i<n;i++)
cout<<a[i]<<endl;
}
