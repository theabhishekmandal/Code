'''
## fibonacci using recursion
def fibo(i):
	if i==0:
		return 0
	elif i==1:
		return 1
	else:
		return fibo(i-2)+fibo(i-1)
n=int(input("enter the terms upto which you want to find fibonacci").strip())
if n<1:
	print("try again")
	exit(1)
else:
	for i in range(0,n):
		print(str(fibo(i)))
'''


n=int(input("enter a number upto which you want to find the fibo").strip())
if n<0:
	print("wrong input")
	exit(1)
else:
	a=0; b=1
	if n==1:
		print(0)
		exit(0)
	if n==2:
		print(0,1)
		exit(0)
	else:
		print(0)
		print(1)
		##fib=[0,1]
		for i in range (3,n+1):
			c=a+b
			print(c)
			a=b
			b=c


