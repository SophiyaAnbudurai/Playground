#include<iostream>
struct node
{
	int data;
	struct node *next;
};
using namespace std;
int main()
{
	node *head=NULL,*newnode,*temp;
	int d;
	 while(1)
	 {
	 	cin>>d;
	 	if(d==-1)
	 	break;
	 	newnode =new node();
	 	newnode->data=d;
	 	newnode->next=NULL;
	 	if(head==NULL)
	 	head=newnode;
	 	else
	 	{
	 	 temp=head;
          newnode->next=head;
          head=newnode;
        
        }
	 }
	  temp=head;
     cout<<"Before deleting:"<<endl;
	 while(temp!=NULL)
	 {
	 	cout<<temp->data<<" ";
	 	temp=temp->next;
	 }
  cout<<endl;
  int i=1;
	 while(head!=NULL){
       cout<<"Deleted element is ";
	 temp=head;
	 head=head->next;
	 temp->next=NULL;
       cout<<temp->data;
	 delete temp;	 
       cout<<endl;
     }
  cout<<"Stack is empty";
}
