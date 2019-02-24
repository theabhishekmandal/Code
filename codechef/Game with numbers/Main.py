from collections import OrderedDict
if __name__ == '__main__':
	for _ in range(int(input().strip())):
		n, k = map(int ,input().strip().split(' '))
		a = list(map(int, input().strip().split(' ')))
		total = 0
		val = {}
		d = list(map(int, input().strip().split(' ')))
		for i in range(n):
			total += d[i]
			val[a[i]] = d[i]
		val = dict(OrderedDict(sorted(val.items(), key = lambda x: x[0])))
		l = 0
		r = total
		b = list(map(int, input().strip().split(' ')))
		for i in range(len(b)):
			# Chef's turn
			if i % 2 == 0:
				l = r - b[i]
			else:
				r = l + b[i]

		ans = 0
		for i in range(n):
			ans += min(r, d[i]) * a[i]
			r -= min(r, d[i])
			ans -= min(l, d[i]) * a[i]
			l -= min(l, d[i])
		print(ans)


