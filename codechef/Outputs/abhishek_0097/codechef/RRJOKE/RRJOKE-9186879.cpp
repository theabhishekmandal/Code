#include <iostream>

using namespace std;

int main()
{
    int t,n,a,b,res,i;
    cin>>t;
    while(t--)
    {
    res=0;
    cin>>n;
    for(i=1;i<=n;i++)
    {
    cin>>a>>b;
    res=res^i;
    }

    cout<<res<<endl;
    }
    return 0;
}