for i in range (int(input().strip())):
	n=int(input())
	five=5
	count=0
	while n//five>0:
		count+=n//five
		five=five*five
	print(count)
