#include<iostream>
using namespace std;
int main()
{
  int n, m;
 while (scanf("%d%d", &n, &m) == 2)
{
int S[100], ans = 0,cap=0;
for (int i = 0; i < n; i++)
cin>>S[i];
for (int i = 0; i < n;)
 {
   while (cap + S[i] <= m)
   cap += S[i++];
   ans++;
   cap=0;
 }
 cout<<ans;
}
	return 0;
}
  //Type your code here.
