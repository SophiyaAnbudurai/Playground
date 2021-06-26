#include<iostream>
#include<cstdlib>
using namespace std;
struct node
{
  int data;
  struct node*left;
  struct node*right;
};
struct node*head;
void append(int d)
{
  struct node*newnode=(struct node*)malloc(sizeof(struct node));
  struct node*temp=head;
  newnode->data=d;
  newnode->left=NULL;
  newnode->right=NULL;
  if(head==NULL)
  {
    head=newnode;
  }else
  {
    while(true)
    {
      if(d<temp->data)
      {
        if(temp->left!=NULL)
        {
          temp=temp->left;
        }else
        {
          temp->left=newnode;
          break;
        }
      }else
      {
        if(temp->right!=NULL)
        {
          temp=temp->right;
        }else
        {
          temp->right=newnode;
          break;
        }
      }
    }
  }
}
struct node* ancestor(struct node*temp,int n1,int n2)
{
  if(temp->data>n1&&temp->data>n2)
    return ancestor(temp->left,n1,n2);
   if(temp->data<n1&&temp->data<n2)
     return ancestor(temp->right,n1,n2);
 return temp;
}
int main()
{
  int d;
  do
  {
    cin>>d;
    if(d>0)
      append(d);
  }while(d!=-1);
  int n1,n2;
  cout<<"Enter the value of n1 and n2:"<<endl;
  cin>>n1>>n2;
  struct node*p=ancestor(head,n1,n2);
  cout<<"Common ancestor of "<<n1<<" and "<<n2<<" is "<<p->data;
  return 0;
}