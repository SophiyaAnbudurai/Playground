#include<iostream>
#include<cstdlib>
#include<cstring>
using namespace std;
class Node{
  public:
    int a[50],nn,top;
    char s[10];
    
};
void initpostfix (Node * ax) {
    ax->top=-1;
}
void setexpr (Node *ax, char *str) {
    strcpy(ax->s,str);
}
void push (Node *ind, int n){
    ind->a[++ind->top]=n;
    }
int pop (Node *ind){
return ind->a[ind->top--];
} 
void calculate (Node *ax) {
        int i=-1,b,c;
while(ax->s[++i]!='\0'){
    if(ax->s[i]>='0'&&ax->s[i]<='9')
    push(ax,ax->s[i]-48);
    else{
        c=pop(ax);
        b=pop(ax);
        if(ax->s[i]=='+')
        push(ax,c+b);
        if(ax->s[i]=='-')
        push(ax,c-b);
        if(ax->s[i]=='*')
        push(ax,c*b);
        if(ax->s[i]=='/')  
        push(ax,c/b);
    }
}
ax->nn=pop(ax);    
}
void show (Node *r) {
   cout<<("Answer is ")<<r->nn ;
}
int main()
{char str[10];
  Node b;
    initpostfix(&b);
    cin>>str;
//printf("\nHAI");
    setexpr(&b,str);
    calculate(&b);
    show(&b);
    //Fill the code
    return 0;
}
