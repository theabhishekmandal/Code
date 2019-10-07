a,b=map(int,input().strip().split(" "))
list1=list(int(i) for i in str(a))
list2=list(int(i) for i in str(b))
list1=reversed(list1)
list2=reversed(list2)
res=[]
for i in range (0,len(list1),):
	num1=list1[i]
	carry=0
	for j in range(0,len(list2),):
		num2=list2[j]
		res[i+j]+=num1*num2+carry
		carry=res[i+j]/10
		res[i+j]=res[i+j]%10
		if carry>0:
			res[len(list2)+i]=carry
print("".join(str(i) for i in reverse(res)))
