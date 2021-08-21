#include <iostream>
using namespace std;

double division(float a, float b) {
   if( b == 0 ) {
      throw "Exception occurred\nMath error: Attempted to divide by Zero";
   }
   return (a/b);
}

int main () {
   float x;
  float y;
   double z;
 cin>>x>>y;
   try {
      z = division(x, y);
      cout <<"The quotient is "<< z << endl;
   } catch (const char* msg) {
     cerr << msg << endl;
   }

   return 0;
}