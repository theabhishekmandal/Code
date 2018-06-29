#include <iostream>
#include<stdlib.h>

using namespace std;

int main()
{
    long int a;
   while(1)
   {
       cin>>a;
      
           if(a!=42)
           {
               cout<<a<<endl;
           }
           else if(a==42)
           {
            exit(0);
            }
        }

    return 0;
}