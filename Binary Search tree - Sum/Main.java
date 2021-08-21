#include<iostream>
#include<stdlib.h>
using namespace std;
struct node
{
  int data;
  struct node*left,*right;
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
int sum1(struct node*temp)
{
  if(temp==NULL)
    return 0;
  return(temp->data+sum1(temp->left)+sum1(temp->right));
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
  //display(head);
cout<<"Sum of all nodes are "<<sum1(head);
  return 0;
}
