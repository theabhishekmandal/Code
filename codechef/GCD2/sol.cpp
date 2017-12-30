#include<iostream>
#define ll long long int
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		ll a;
		char b[250];
		cin>>a;
		gets(b);
		if(a==0)
			cout<<b<<endl;
		else
		{
			ll one=0;
			for(int i=0;b[i];i++)
			{
				one=((one*10)+b[i]-'0')%a;
			}
			while(one!=0)
			{
				ll temp=one%a;
				one=a;
				a=temp;	
			}
			cout<<a<<endl;
		}
	}
	return 0;
}