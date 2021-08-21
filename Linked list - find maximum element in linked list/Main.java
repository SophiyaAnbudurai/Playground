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
	 	  while(temp->next!=NULL)
	 	  temp=temp->next;
	 	  temp->next=newnode;
		 }
	 }
     int max=0;
	 temp=head;
	 while(temp!=NULL)
	 {
	 	if(temp->data>max)
          max=temp->data;
	 	temp=temp->next;
	 }
  cout<<max;
}