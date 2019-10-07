'''
This program will display all the binomial coefficients 
'''
from math import factorial as f
h=int(input('enter the no. of levels of binomial coefficient'))
c=[[f(n)/f(k)/f(n-k) for k in range(n+1)] for n in range(h+1)]
for i in c:
	for _ in range(h+1-len(i)):
		print(' ',end='')
	for j in i:
		print(int(j),end=' ')
	print()
