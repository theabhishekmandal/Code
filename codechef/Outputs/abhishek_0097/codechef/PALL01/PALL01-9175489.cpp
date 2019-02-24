#include <iostream>

using namespace std;

int main()
{
    int t; long int a,n,r,sum;
    cin>>t;
    while(t--)
    {
        cin>>a;
        n=a; sum=0;
        while(a!=0)
        {
            r=a%10;
            sum=sum*10+r;
            a=a/10;
        }
        if(sum==n)
        {
            cout<<"wins"<<endl;
        }
        else
            {
                cout<<"losses"<<endl;

            }

    }
    return 0;
}