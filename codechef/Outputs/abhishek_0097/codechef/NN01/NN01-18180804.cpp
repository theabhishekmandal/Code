#include<bits/stdc++.h>
using namespace std;
#define For(i, a, b) for(int i = a; i < b; i++)
#define rep(i, b) for(i, 0, b)
#define ll long long int
int main(int argc, char const *argv[])
{
	int seven = 7;
	int cse[7];
	int mech[7];
	int cseto = 0;
	int mechto = 0;
	For(i,0,7){
		cin >> cse[i];
		cseto += cse[i];
	}
	For(i,0,7){
		cin >> mech[i];
		mechto += mech[i];
	}
	cout << ((mechto > cseto)? "mech" : "cse") << endl;
	return 0;
}