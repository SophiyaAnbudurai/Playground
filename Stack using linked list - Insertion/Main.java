#include<iostream>
struct node
{
	int data;
	struct node *next;
}*head=NULL;
using namespace std;
int main()
{
	node *newnode,*temp;
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
	 	  newnode->next=head;
	 	  head=newnode;
		 }
	 }
	  temp=head;
	 while(temp!=NULL)
	 {
	 	cout<<temp->data<<" ";
	 	temp=temp->next;
	 }
}