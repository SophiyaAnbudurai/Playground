#include<iostream>
using namespace std;
  int recSearch ( int a[], int l, int r, int index)
{
  if ( r < l)
    return -1;
  if ( a[l] == index)
    return 1;
  if (a[r] == index)
    return 1;
  return recSearch ( a, l+1, r-1, index);
}
int main()
{
  int a[100];
  int n;
  cin >> n;
  for ( int i = 0; i < n; i++ )
  {
    cin >> a[i];
  }
  int x;
  cin >> x;
  int index = ( recSearch ( a , 0 , n-1 , x));
               if ( index != -1)
               cout << x;
        else
               cout << "The number is not present in the list";
               
 }