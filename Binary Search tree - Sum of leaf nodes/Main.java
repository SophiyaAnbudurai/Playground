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
int leafnode(struct node*temp,int*sum)
{
  if(temp==NULL)
  {
    return 0;
  }
  if(temp->left==NULL&&temp->right==NULL)
  {
    *sum+=temp->data;
  }
  leafnode(temp->left,sum);
  leafnode(temp->right,sum);
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
  int sum=0;
  leafnode(head,&sum);
  cout<<"Sum of all leaf nodes are "<<sum;
  return 0;
}
