#include<iostream>
using namespace std;
int main()
{
  string s1 , s2 ; 
  int antakshari , l ;
  cin >> s1 ; 
  s2 = s1 ;
  cout << s1 << endl ;
  while ( 1 ) 
  {
    cin >> s1 ;
    l = 0 ;
    if ( s1 == "####" )
      break ;
    antakshari = 0 ;
      while ( s2[l++]!='\0');
      l-- ;
      if ( s2[l-1] == s1[0] )
      {
        cout << s1 << endl ;
        antakshari = 1 ;
      }
    if ( antakshari == 1 )
      s2 = s1 ; 
  }
  return 0 ;
}
