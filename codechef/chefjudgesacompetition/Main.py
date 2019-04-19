if __name__ == '__main__':
	for _ in range(int(input().strip())):
		n = int(input().strip())
		alice = list(map(int, input().strip().split(' ')))
		bob = list(map(int, input().strip().split(' ')))
		alicelarge = -1
		save = 0
		for i in range(len(alice)):
			alicelarge = max(alicelarge, alice[i])
			save += alice[i]
		save -= alicelarge

		boblarge = -1
		save2 = 0
		for i in range(len(bob)):
			boblarge = max(boblarge, bob[i])
			save2 += bob[i]
		save2 -= boblarge
		if save2 > save:
			print('Bob')
		elif save > save2:
			print('Alice')
		else:
			print('Draw')



