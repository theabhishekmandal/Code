for _ in range(int(input().strip())):
	global m
	n, m = list(map(int, input().strip().split(' ')))
	arr = list(map(int, input().strip().split(' ')))
	length = len(arr)
	count = 0;
	for i in range(len(arr)):   # for index begining
		for j in range(1, len(arr) + 1 - i): # for determining the lenght upto which it will print
			val = arr[i : i + j]
			if len(val) is not length:
				summation = 0
				for k in val:
					summation += k
				if summation % m is 0:
					count += 1
	print(count)