#include <iostream>
using namespace std;
int main() 
{
 int t ,k; long int a,n;
 cin>>t;
 while(t)
 {
     cin>>a; k=0;
     while(a!=0)
     {   
         n=a%10;
         a=a/10;
         if(n==4)
         {
             k++;
         }
     }
     cout<<k<<endl;
     t--;
 }
		return 0;
}