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
void display(struct node*head)
{
  if(head==NULL)
  {
    return;
  }else
  {
    
    display(head->left);
    display(head->right);
    cout<<head->data<<" ";
  }
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
      cout<<"Post order Traversal:"<<endl;
  display(head);
  return 0;
}
