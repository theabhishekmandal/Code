#include <iostream>
#include<cstdio>

using namespace std;

int main()
{
int t,i;
cin>>t;
while(t--)
{
char a[100],b[100]; int max=0,min=0;
scanf("%s%s",&a,&b);
for(i=0;a[i];i++)
{
if((a[i]=='?'&&b[i]!='?')||(b[i]=='?'&&a[i]!='?'))
{
max++;
}
else
if(a[i]=='?'&&b[i]=='?')
{
max++;
}
else
if(a[i]!='?'&&b[i]!='?')
{
if(a[i]!=b[i])
{
min++;
}
}
}
max=max+min;
cout<<min<<' '<<max<<endl;
}
    return 0;
}