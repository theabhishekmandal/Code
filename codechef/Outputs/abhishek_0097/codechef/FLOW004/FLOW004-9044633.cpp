#include <iostream>

using namespace std;

int main()
{
   int t,p; long int a;
   cin>>t;
   while(t)
 {
     cin>>a; p=0;
     p=a%10;
     while((a/10)!=0)
     {
         a=a/10;
     }
     p=p+a;
     cout<<p<<endl;
     t--;
 }   return 0;
}