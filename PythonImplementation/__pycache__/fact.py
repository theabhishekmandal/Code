n = int(input())
fact = 1
for i in range(n, 0, -1):
	fact = fact * i
	if i == 1:
		print('1=', fact, end = '')
	else:
		print(i, '*', end = '')