#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
char c;
int isLowercaseVowel,isUppercaseVowel;
cin>>c;

    // evaluates to 1 (true) if c is a lowercase vowel
isLowercaseVowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');

    // evaluates to 1 (true) if c is an uppercase vowel
isUppercaseVowel = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');

    // evaluates to 1 (true) if either isLowercaseVowel or isUppercaseVowel is true
if ((c>='a'&& c<='z') || (c>='A'&& c<='Z'))
   {
if (isLowercaseVowel || isUppercaseVowel)
cout<<"Vowel";
else
cout<<"Consonant";
   }
else
cout<<"Not an alphabet";


return 0;
}
