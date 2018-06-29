#include<bits/stdc++.h>
using namespace std;
#define For(i, a, b) for(int i = a; i < b; i++)
#define rep(i, b) for(i, 0, b)
#define ll long long int
int main(int argc, char const *argv[])
{
	int n, k;
	cin >> n >>k;
	int count = 0;
	For(i, 0,n){
		int t;
		cin >> t;
		if(t % k == 0)
			count ++;
	}
	cout << count <<  endl;
	return 0;
}