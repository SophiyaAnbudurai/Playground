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
  cout<<"Before inserting the value:"<<endl;
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
	  temp=head;
	 while(temp!=NULL)
	 {
	 	cout<<temp->data<<endl;
	 	temp=temp->next;
	 }
	 int pos;
	 cout<<"Enter the position and value to be inserted:"<<endl;
        cin>>pos;
	    cin>>d;
	 	newnode =new node();
	 	newnode->data=d;
	 	newnode->next=NULL;
	 	
	 		
	 		temp=head;
	 		for(int i=0;i<pos-1;i++)
	 		temp=temp->next;
	 		newnode->next=temp->next;
	 		temp->next=newnode;
	 temp=head;
  cout<<"After inserting the value:"<<endl;
	 while(temp!=NULL)
	 {
	 	cout<<temp->data<<endl;
	 	temp=temp->next;
	 }
}
