#include<iostream>
using namespace std;
int sum(int n)
{
    if(n != 0)
        return n + sum(n - 1);
  else
    return 0;
}



int main()
{
    int n,result;

    cin >> n;
  result=sum(n);
    cout<< result;
    return 0;
}
  //Type your code here.
