#include<iostream>
using namespace std;
int main()
{
int t; long int a,b;
cin>>t;
while(t)
{
cin>>a>>b;
b=a%b;
cout<<b<<endl;
--t;
}
return 0;
}