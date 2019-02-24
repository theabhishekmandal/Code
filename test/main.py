from sys import maxsize
global arr
arr = [0] * 10000002
def getval(i):
	if i < len(arr) and arr[i] == 0:
		if(i % 2 == 0):
			arr[i] = 1 + getval(i >> 1)
			return arr[i]
		else:
			arr[i] = 2 + getval((3 * i + 1) >> 1)
			return arr[i]
	elif i > len(arr):
		if(i % 2 == 0):
			return 1 + getval(i >> 1)
		else:
			return 2 + getval((3 * i + 1) >> 1)
	return arr[i]



if __name__ == '__main__':
	for _ in range(int(input().strip())):
		one ,two = [int(i) for i in input().strip().split(' ')]
		maxint = -maxsize
		arr[1]  = 1
		for i in range(one, two):
			count = getval(i)
			if count > maxint:
				maxint = count
		print(one, two, maxint, end = ' ')
		print()