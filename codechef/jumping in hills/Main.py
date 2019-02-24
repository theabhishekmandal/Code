if __name__ == '__main__':
	for _ in range(int(input().strip())):
		n, u, d = map(int, input().strip().split(' '))
		arr = list(map(int, input().strip().split(' ')))
		count = 0;
		save = 1;
		for i in range(1, len(arr)):
			height = arr[i - 1] - arr[i]
			if height >= 0:
				if height > d and count == 0:
					count = 1
					save = i + 1
				elif height <= d:
					save = i + 1
				else:
					break
			elif height < 0:
				if -height <= u:
					save = i + 1
				else:
					break
		print(save)

'''
3
5 3 2
2 5 2 6 3
5 2 3
4 4 4 4 4
5 2 7
1 4 3 2 1
'''

