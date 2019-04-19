def gcd(a:int, b:int) -> int:
	return a if b == 0 else gcd(b, a % b)
if __name__ == '__main__':
	for _ in range(int(input().strip())):
		n = int(input().strip())
		arr = list(map(int, input().strip().split(' ')))
		res = arr[0]
		for i in arr[1:]:
			res = gcd(res, i)
		if(res == 1): print(0)
		else: print(-1)
