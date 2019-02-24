#include <iostream>

using namespace std;

int main()
{

char a[100]; int i,j,sum;
cin>>i;
while(i)
{
    sum=0;
    cin>>a;
    for(j=0;a[j]!=NULL;j++)
    {
        if(a[j]=='A'||a[j]=='D'||a[j]=='O'||a[j]=='P'||a[j]=='Q'||a[j]=='R')
        {
            sum++;
        }
        else if(a[j]=='B')
        {
            sum=sum+2;
        }
    }
    cout<<sum<<endl;
    i--;
}

     return 0;
}