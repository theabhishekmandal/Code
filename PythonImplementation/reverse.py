def reverse(arr,i,j):
	while j<=i:
		save=arr[i]
		arr[i]=arr[j]
		arr[j]=save
		i-=1
		j+=1
if __name__ == '__main__':
	n=[str(i) for i in input().strip()]
	k=n[::-1]
	j=0
	i=0
	for i in range(len(k)):
		if k[i] == ' ':
			if i-j>0:
				reverse(k,i-1,j)
				j=i
			j+=1
	reverse(k,i,j)
	print(''.join(k))
	
