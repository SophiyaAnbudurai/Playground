#include<iostream>
#include<stdio.h>
#include<bits/stdc++.h>
using namespace std;
int main()
{
string name;
  int roll,total;
  float per;
  cin>>name;
  cin>>roll;
  cin>>total;
  cout<<"Enter name:"<<endl;
  cout<<"Enter roll number:"<<endl;
  cout<<"Enter total marks outof 500:"<<endl;

cout<<"Student details:"<<endl;

cout<<"Name: "<<name<<endl;

cout<<"Roll Number: "<<roll<<endl;

cout<<"Total: "<<total<<endl;
per=(float)total/5;

cout<<"Percentage: "<<per;
}