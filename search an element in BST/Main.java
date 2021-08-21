#include<iostream>
#include<stdlib.h>
using namespace std;
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
bool iterativeSearch(struct node* root, int key) 
{ 
    // Traverse untill root reaches to dead end 
    while (root != NULL) { 
        // pass right subtree as new tree 
        if (key > root->data) 
            root = root->right; 
  
        // pass left subtree as new tree 
        else if (key < root->data) 
            root = root->left; 
        else
            return true; // if the key is found return 1 
    } 
    return false; 
} 
int main()
{
  int d,search;
  do
  {
    cin>>d;
    if(d>0)
      append(d);
  }while(d!=-1);
 cout<<"Enter the element to be searched:"<<endl;
  cin>>search;
  if(iterativeSearch(head,search))
    cout<<search<<" is present in the BST"<<endl;
  else
    cout<<search<<" is not present in the BST"<<endl;
}