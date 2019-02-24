#include<iostream>
using namespace std;
int main()
{
    int t,a,number,i;
    cin>>t;
    while(t)
    {
        cin>>a;
        number=0;
        while(a>2)
        {
            a=(a-2);
            number=number+(a/2);
        }
        cout<<number<<endl;
        t--;
    }

}