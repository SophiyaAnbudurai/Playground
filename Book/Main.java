#include<iostream>
using namespace std;
union book
{
char book[50];
int v;
};
int main()
{
cout<<"Enter the Book details"<<endl;
union book b;
cout<<"Enter the Book name"<<endl;
cin>>b.book;
cout<<"Enter the Book price"<<endl;
cin>>b.v;
cout<<"Book Details"<<endl<<b.book<<" "<<b.v<<endl;
cout<<"Enter the Book name"<<endl;
cout<<"Book Name : Physics";
}
