#include<iostream>
using namespace std;
#define SIZE 10
class STACK{
  int stack[SIZE];
  int top=-1;
  public:
  void push(int);
  void pop();
  void display();
};
int main()
{
  STACK stk;
  int value,choice;
  while(1)
  {
    cin>>choice;
    switch(choice){
      case 1:
        cin>>value;
        stk.push(value);
        break;
      case 2:
        stk.pop();
        break;
      case 3:
        stk.display();
        break;
      case 4:exit(0);
      default:cout<<"\nInvalid input";
    }}}
 void STACK :: push (int value)
 {
   if(top==SIZE-1)
     cout<<"Stack is Full!!! Insertion is not possible!!!";
   else{
     top++;
     stack[top]=value;
   }}
void STACK :: pop(){
  if(top==-1)
    cout<<"Stack is Empty!!! Deletion is not possible!!!";
  else{
    top--;
  }}
void STACK :: display(){
  if(top==-1)
    cout<<"Stack is Empty!!!";
  else
  {
    for(int i=top;i>=0;i--)
      cout<<stack[i]<<endl;}
}