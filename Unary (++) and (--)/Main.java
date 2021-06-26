#include<iostream>
using namespace std;

class IncreDecre
{
        int a;
     public:
        void accept(int x)
        {
               
                cin>>x;
          a=x;
               
        }
        void operator--() //Overload Unary Decrement
        {
                a--;
            cout<<"After decrement - value of n is: "<<a;
              
        }
        void operator++() //Overload Unary Increment
        {
                a++;
              cout<<"After increment - value of n is: "<<a<<endl;
        }
       
};
int main()
{
        IncreDecre id;
  int x;
        id.accept(x);
        //id.operator++();
        ++id;
       //id.operator--();
    --id;
        return 0;
}