#include<bits/stdc++.h>
using namespace std;
#define For(i, a, b) for(int i = a; i < b; i++)
#define rep(i, b) For(i, 0, b)
#define ll long long int
int main(int argc, char const *argv[])
{
	ios::sync_with_stdio(false);                     
	rep(i,2){
		
	ll n;
	cin >> n;
	cout << max(n, n / (ll)2 + n / (ll) 3 + n / (ll) 4) << endl;
	}
			
	return 0;
}