#include<iostream>
using namespace std;
 
class NUM
{
    private:
        int n;
         
    public:
       
        void getNum(int x)
        {
          cin>>x;
            n=x;
        }
        
        void dispNum(void)
        {
            cout << "value of n is: " << n;
        }
        
        void operator ! (void)
        {
            n=!n;
        }
};
int main()
{
    NUM num;
  int x;
    num.getNum(x);
    cout << "Before calling Operator Overloading:";
    num.dispNum();
    cout << endl;
     
    !num;
    cout << "After  calling Operator Overloading:";
    num.dispNum();
    cout << endl;
    return 0;   
}