#include<iostream>
using namespace std;
struct node
{
    int data;
    node* next;
};
void append(node **head,int);
void display_withoutDuplicates(node *head);
void display_withDuplicates(node *head);
int main()
{
    node *head=NULL;
    int data;
    do
    {
    cin>>data;
    if(data>0)
    append(&head,data);
    }while(data>-1);
    display_withoutDuplicates(head);
    return 0;
}

   void append(node **head,int data)
    {
        node *temp,*new_node;
        temp=*head;
    new_node=new node;
    new_node->next=NULL;
    new_node->data=data;
    if(*head==NULL)
    {
        *head=new_node;
    }
    else{
    while(temp->next!=NULL)
        temp=temp->next;
    temp->next=new_node;
    }
    }
    
   void display_withoutDuplicates(node *head)
    {  
     node *temp=head,*temp1;
     int data;
     while(temp!=NULL)
     {
         int count=0;
         data=temp->data;
         temp1=head;
         while(temp1!=temp){
            if(temp1->data==data)
            count++;
            temp1=temp1->next;}
         if(count==0)
         cout<<temp->data<<endl;
         temp=temp->next;
     }
    }
    
