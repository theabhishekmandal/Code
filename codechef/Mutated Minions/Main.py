if __name__ == '__main__':
	for i in range(int(input().strip())):
		n, k = list(map(int, input().strip().split(' ')))
		arr = list(map(int, input().strip().split(" ")))
		count = 0
		for i in arr:
			if (i + k) % 7 == 0:
				count += 1
		print(count)		