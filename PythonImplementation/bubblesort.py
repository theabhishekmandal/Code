n=int(input("enter the size of the array").strip())
print("enter the elements of the array in the same line")
a=list(int(i) for i in input().strip().split(" "))
print("elements after sorting")
for i in range (n-1):
	for j in range (n-1-i):
		if(a[j]>a[j+1]):
			temp=a[j]
			a[j]=a[j+1]
			a[j+1]=temp

print(" ".join(str(i) for i in a))