def insertion(a:list)->list:
	for i in range (1,len(a)):
		key=a[i]
		j=i-1
		while j>=0 and a[j]>key:
			a[j+1]=a[j]
			j-=1
		a[j+1]=key
	return a

if __name__ == '__main__':
	n=int(input("enter the size of the array").strip())
	arr=[]
	print("enter the elements of the array")
	arr.extend(int(i) for i in input().strip().split(" "))
	print(insertion(arr))
	
