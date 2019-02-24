#include <iostream>

using namespace std;

int main()
{
    int t,i,max;
    cin>>t;
    while(t)
    {
        long int a,b;
        max=0;
        cin>>a>>b;
        for(i=1;i<=b;i++)
        {
            if(a%i>max)
                max=a%i;
        }
        cout<<max<<endl;
        t--;

    }
        return 0;
}