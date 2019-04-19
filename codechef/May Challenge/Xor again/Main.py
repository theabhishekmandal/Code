for _ in range(int(input().strip())):
	res = 0
	blah = input()
	for i in map(int, input().strip().split(' ')):
		res ^= (i * 2);
	print(res)
