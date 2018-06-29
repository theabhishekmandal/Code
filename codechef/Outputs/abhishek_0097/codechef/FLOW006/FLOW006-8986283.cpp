#include <iostream>

using namespace std;

int main()
{
   int i; long int a,sum,n;
   cin>>i;
   while(i)
   {
       sum=0;
       cin>>a;
       while(a)
       {
           n=a%10;
           sum=sum+n;
           a=a/10;
       }
       cout<<sum<<endl;
       i--;
   }
    return 0;
}