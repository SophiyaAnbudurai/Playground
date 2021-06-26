#include <iostream>
#include<queue>
using namespace std; 
   
int main () 
{ 
    priority_queue <int> Prior_q; 
  int x, arr[10];
  cout<<"Enter the number of values to be inserted:";
  
  cin>>x;
  cout<<"\nEnter the values to be inserted in priority queue:";
  for(int i=0;i<x;i++)
  {
    cin>>arr[i];
    
    Prior_q.push(arr[i]); 
  }
     cout<<"\nThe priority queue elements are:\n";
    while (Prior_q.empty() == false) 
    { 
        cout << Prior_q.top() << " "; 
        Prior_q.pop(); 
    } 
   
    return 0; 
}