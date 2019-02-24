#include<bits/stdc++.h>
using namespace std;
#define For(i, a, b) for(int i = a; i < b; i++)
#define rep(i, b) for(i, 0, b)
#define ll long long int
ll gcd(ll a, ll b){
	return (b == 0)? a: gcd(b, a % b);
}

ll lcm(ll a, ll b){
	return (a * b)/ gcd(a, b);
}
int main(int argc, char const *argv[])
{
	int t;
	cin >> t;
	For(i,0,t){
		ll a, b;
		cin >> a >> b;
		cout << lcm(a,b) << endl;
	}
	return 0;
}