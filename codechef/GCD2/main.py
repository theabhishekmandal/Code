if __name__ == "__main__":
	for _ in range(int(input().strip())):
		l = input().strip().split(' ')
		a = int(l[0])
		b = l[1]
		save = 0
		for i in b:
			save = (save * 10 + int(i)) % a
		while save != 0:
			temp = save % a
			a = save
			save = temp
		print(a)
			