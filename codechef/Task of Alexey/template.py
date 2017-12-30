def gcd(a,b):
	if a==b:
		return a
	if a>b:
		return gcd(a-b,b)
	return gcd(a,b-a)

def lcm(a,b):
	return (a*b)//gcd(a,b)

if __name__ == '__main__':
	
	t=int(input().strip())
	for _ in range(t):
		n=int(input().strip())
		arr=[]
		for i in range(n):
			arr.append(int(input().strip()))
		mini=99999999999
		for i in range(n):
			for j in range(i+1,n):
				mini=min(mini,lcm(arr[i],arr[j]))
		print(mini)
