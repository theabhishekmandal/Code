#include<bits/stdc++.h>
#define ll long long int
#define fori(i,n,j) for(int i = 0 ; i < n ; i+=j)
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		ll a;
		string b;	
		cin>>a;
		scanf("%s",b);
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