def Quicksort(arr:list,p:int,r:int)-> None:
	if p<r:
		q=partition(arr,p,r)
		Quicksort(arr,p,q-1)
		Quicksort(arr,q+1,r)
def partition(arr:list,p:int,r:int) ->int:
	pindex=p
	pivot=arr[r]
	for i in range(p,r):
		if arr[i] <= pivot:
			arr[i],arr[pindex]=arr[pindex],arr[i]
			pindex+=1
	arr[pindex],arr[r]=arr[r],arr[pindex]
	return pindex

if __name__ == '__main__':
	arr=[]
	n=int(input('enter the size of the array \n'))
	print('enter the array elements ')
	arr=[int(i) for i in input().strip().split(' ')]
	Quicksort(arr,0,len(arr)-1)
	print(" ".join(str(i) for i in arr))