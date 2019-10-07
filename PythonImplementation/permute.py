def permute(i,a):
	if i==len(a)-1:
		print("".join(a))
	else:
		for j in range (i,len(a)):
			a[i],a[j]=a[j],a[i]
			permute(i+1,a)
			a[i],a[j]=a[j],a[i]


if __name__=="__main__":
	a=[str(i) for i in input('enter a string \n').strip()]
	map(permute(0,a),a)

