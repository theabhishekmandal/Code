#include <iostream>

using namespace std;

int main()
{
int t,p; long int a,b,s=0,k=0,big=0;
cin>>t;
while(t)
{
    cin>>a>>b;
    s=s+a; k=k+b;
    if(s>k)
    {
        if(s-k>big)
        {
            big=s-k;
            p=1;
        }

    }
    if(k>s)
    {
        if(k-s>big)
        {
            big=k-s;
            p=2;
        }
    }
    t--;
}
cout<<p<<' '<<big;
 return 0;
}