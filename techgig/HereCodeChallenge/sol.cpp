#include<bits/stdc++.h>
using namespace std;
bool isprime(int n)
{
	if(n < 2) return false;
	if(n <= 3) return true;
	if(n % 2 == 0 || n % 3 == 0) return false;
	else
	{
		for(int i = 5 ; i * i <= n; i += 6)
		{
			if(n % i == 0 || n % (i + 2) == 0)
				return false;
		}
	}
	return true;
}

bool isvalidprime(int n, int k)
{
	if(n < 2 * k)
		return false;
	if(k == 1)
		return isprime(n);
	if(k == 2)
	{
		if((n & 1) == 0)
			return true;
		else
			return isprime(n - 2);
	}
	return true;
}

int main()
{
	int k,n;
	cin >> k >> n;
	int arr[n];
	bool visit[n];
	for(int i = 0; i < n ; i++)
		cin >> arr[i];
	bool valid;
	for(int i = 0; i < n ; i++)
	{
		valid = true;
		if(!visit[i])
		{
			int step = 0;
			int sum = 0;
			int j = i;
			while(j < n)
			{
				visit[i] = true;
				sum += arr[j];
				step++;
				j += k;
			}
			valid = isvalidprime(sum, step);
		}
		if(!valid)
		{
			cout << -1 << endl;
			exit(0);
		}
	}
	cout<< 1 << endl;
	return 0;
}
