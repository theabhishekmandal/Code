if __name__ == '__main__':
	for _ in range(int(input().strip())):
		one, two = input().strip().split(' ')
		large = one if len(one) > len(two) else two
		small = one if len(one) <= len(two) else two
		k = 0
		for i in range(len(large)):
			if large[i] in small[k]:
				k += 1
			if k == len(small):
				break
		if(k == len(small)):
			print("YES")
		else:
			print("NO")

	
