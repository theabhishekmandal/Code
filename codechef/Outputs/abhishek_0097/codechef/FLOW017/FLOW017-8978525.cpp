#include<iostream>
using namespace std;
int main()
{

    int i; int a,b,c;
    cin>>i;
    while(i)
    {
        cin>>a>>b>>c;
        if((a>b&&b>c)||(c>b&&b>a))
        {
            cout<<b<<endl;
        }
        else
            if((c>a&&a>b)||(b>a&&a>c))
        {
            cout<<a<<endl;
        }
        else if((a>c&&c>b)||(b>c&&c>a))
        {
            cout<<c<<endl;
        }
        else if((a==b)||(b==c)||(c==a))
        {
            cout<<a<<endl;
        }
        --i;
         }
    return 0;

}