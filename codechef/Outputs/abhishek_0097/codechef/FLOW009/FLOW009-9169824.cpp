#include <iostream>
#include<stdio.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        float a,b,c;
        cin>>a>>b;
        c=a*b;
        if(a>=1000)
        {
            printf("%f\n",c-(0.1*c));
        }
        else
        {
            printf("%f\n",c);
        }
}
    return 0;
}