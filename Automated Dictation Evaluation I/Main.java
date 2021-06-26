#include<iostream>
#include<string.h>
using namespace std;
int main()
{
char s1[50],s2[50];// Declaartion of two character arrays
cin>>s1>>s2;
strcmp(s1,s2);// strcmp function is used to compare the two strings whether both the strings are equal or not if both are equal it returns 0 else returns a positive integer
if(strcmp(s1,s2)==0)// checking the condition wheter the value returnd nby function equals 0 or not if true it will print it is correct
cout<<"It is correct";
else
cout<<"It is wrong";
}
