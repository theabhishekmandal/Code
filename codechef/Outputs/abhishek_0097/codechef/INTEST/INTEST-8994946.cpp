#include <iostream>

using namespace std;

int main()
{
    int n,k,t=0; long int a;
    cin>>n>>k;
    while(n)
    {
        cin>>a;
        if(a%k==0)
        {
            t=t+1;
        }
        --n;
    }
    cout<<t;
    return 0;
}