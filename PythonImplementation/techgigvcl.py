def possibleways(input1):
	a=[0]*len(input1)
	a[0]=input1[0]
	for i in range (1,len(input1)):
		a[i]=input1[i]+a[i-1]
	answer=0
	longvalue=1000000007
	for i in range (1,len(a)+1):
		for j in range (0,len(a)+1-i):
			save=0
			if(j==0):
				save+=a[i+j-1]
			else:
				save+=a[i+j-1]-a[j-1]
			answer+=((save%longvalue)*(input1[i+j-1]%longvalue))%longvalue
	return answer%longvalue;
a=[]
for _ in range(int(input().strip())):
	a.append(int(input().strip()))
print(possibleways(a))