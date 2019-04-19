mod = 1000000000 + 7
for _ in range(input().strip()):
	n, m = list(map(int, input().strip().split(' ')))
	A = list(map(int, input().strip().split(' ')))
	B = list(map(int, input().strip().split(' ')))
	result = 0
	for i in range(0, m):
		for j in range(0, m):
			fib = [0] * max(2, n)
			fib[0] = A[i]
			fib[1] = B[i]
			for k in range(2, n):
				fib[k] = fib[k - 1] + fib[k - 2]
			result = result + fib[]
