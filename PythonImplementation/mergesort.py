from sys import maxsize
import time
def merge(arr:list,p:int,q:int,r:int)->None:
	n1 = q - p + 1
	n2 =r - q
	one = [arr[p + i] for i in range(0, n1)]
	two=[arr[q + 1 + i] for i in range(0, n2)]
	one.append(maxsize)
	two.append(maxsize)
	i=0
	j=0
	for k in range(p, r + 1):
		if one[i] <= two[j]:
			arr[k] = one[i]
			i += 1
		else:
			arr[k] = two[j]
			j += 1


def mergesort(arr:list,p:int,r:int) -> None:
	if p < r:
		q = p + (r - p) // 2
		mergesort(arr, p, q)
		mergesort(arr, q + 1, r)
		merge(arr, p, q, r)

		
if __name__ == '__main__':
	starttime =  time.time()
	n=int(input("enter the size of the array").strip())
	arr=[int(i) for i in input().strip().split(' ')]
	mergesort(arr, 0, len(arr) - 1)
	print(" ".join(str(i) for i in arr))
	print(time.time() - starttime)
