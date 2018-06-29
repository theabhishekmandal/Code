#include <iostream>

using namespace std;

int main()
{
   int t,a,i,flag;
cin>>t;
while(t)
{
    cin>>a; flag=0;
    for(i=1;i<=a;i++)
    {
        if((a%i)==0)
        {
            flag++;
        }
    }
    if(flag>2)
    {
        cout<<"no"<<endl;
    }
    else
        {
            cout<<"yes"<<endl;
        }
    t--;
}
    return 0;
}