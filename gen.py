import pprint
pp = pprint.PrettyPrinter(width=41, compact=True)
arr = [0] * 101
def add(n, k):
	global arr, pp
	for i in range(1, len(arr)):
		if i % n == 0:
			if k is 1:
				arr[i] -= i 
			else:
				arr[i] += i
	pp.pprint(arr)
def num():
	count = 0
	global arr
	for i in range(len(arr)):
		if arr[i] != '':
			count += 1
	pp.pprint(count)
add(2, 0)
num()
add(3, 0)
num()
add(6, 1)
num()
add(5, 0)
num()
add(10, 1)
num()
add(15, 1)
num()
add(30, 0)
num()




