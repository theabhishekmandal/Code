#include <bits/stdc++.h>

using namespace std;

const int MAXN = 10005;
const int INF = (int) 1e9;

int t, n, m;
int a[MAXN], b[MAXN];
long long f[MAXN];

void solve() {
	cin >> m >> n;
	for (int i = 1; i <= m; ++i) cin >> a[i];
	for (int i = 1; i <= m; ++i) cin >> b[i];
	long long ans = 0;
	for (int i = 1; i <= m; ++i) {
		for (int j = 1; j <= m; ++j) {
			memset(f, 0, (n + 5) * sizeof(f[0]));
			f[1] += a[i];
			f[2] += b[j];
			for (int k = 3; k <= n; ++k) {
				f[k] = (f[k - 1] + f[k - 2]) % (INF + 7);
			}
			ans += f[n];
			ans %= INF + 7;
		}
	}
	cout << ans << "\n";
}

int main() {
	scanf("%d", &t);
	while (t --> 0) {
		solve();
	}
	return 0;
}
