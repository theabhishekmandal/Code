def isprime(n : int) -> bool:
	if n < 2 : return False
	if n <= 3 : return True
	if n % 2 == 0  or n % 3 == 0:
		return False
	else:
		for i in range(5, (int)(n ** (0.5)) + 1, 6):
			if n % i == 0 or n % (i + 2) == 0:
				return False
	return True

def isvalidprime(n : int, k : int) -> bool:
	if n < 2 * k: return False
	if k == 1: return isprime(n)
	if k == 2:
		if (n & 1) == 0:
			return True
		else:
			return isprime(n - 2)
	return True

def main():
	k = int(input().strip())
	n = int(input().strip())
	arr = [int(i) for i in input().strip().split(' ')]
	visited = [False] * len(arr)
	for i in range(len(arr)):
		valid = True
		if visited[i] == False:
			add = 0
			step = 0
			j = i
			while j < len(arr):
				visited[j] = True
				add += arr[j]
				step += 1
				j += k
			valid = isvalidprime(add, step)
		if valid == False:
			print(-1)
			return
	print(1)

main()



