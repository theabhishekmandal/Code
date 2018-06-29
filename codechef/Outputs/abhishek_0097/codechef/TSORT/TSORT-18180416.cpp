#include<bits/stdc++.h>
using namespace std;
#define For(i, a, b) for(int i = a; i < b; i++)
#define rep(i, b) for(i, 0, b)
#define ll long long int
int main(int argc, char const *argv[])
{
	int n;
	cin >> n;
	int arr[n];
	For(i, 0,n){
		cin >> arr[i];
	}
	std::sort(arr, arr + sizeof(arr) / sizeof(arr[0]));
	For(i, 0, n){
		cout << arr[i] << endl;
	}
	return 0;
}