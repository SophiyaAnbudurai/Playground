#include<iostream>
#include<string.h>
using namespace std;
int main()
{
string s;// Declaration of string
getline(cin,s);// Getline is the sting function which is used to get an input string pr a line from the input stream
char c[100];// Declaration of character array
int j=0;//Initializing j as 0
for(int i=0;s[i];i++)
  {
//Forloop Starting from I value as 0 till the string ends 
if( s[i]=='t'&& s[i+1]=='h'&& s[i+2]=='e')//here I am checking if the fisrt character is t and next is h and next is e
i=i+3;//As I have checked 3 letters for “THE” now I have to increment I by 3 so that it will point the fourth letter and to proceed with the loop.
else
c[j++]=s[i];//  if the “if ”condition fails then we have to check with the 4th letter as I have incremented the I value  so fourth lwtter will be assigned to c[1]as j is incremented to 1
  }
c[j]='\0';// Always we should end a string with \0
cout<<c;//printing the output
return 0;
}
