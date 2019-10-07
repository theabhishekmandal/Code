if __name__ == '__main__':
	for i in range(int(input().strip())):
		c,d,l=[int(i) for i in input().strip().split(' ')]
		ans=''
		if d>=c:
			min=d*4
i			max=(c+d)*4
		elif c>d:
			min=(c-2*d)+d
			min*=4
			max=(c+d)*4
			ans="yes" if l>=min and l<=max and l%4==0 else "no"
		print(ans)
