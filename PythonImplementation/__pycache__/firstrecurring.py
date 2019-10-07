def first_rec(string:str)->str:
	ret='nothing found'
	occur={}
	for i in string:
		occur.setdefault(i,0)
		if occur[i]>1:
			return i
		else:
			occur[i]+=1
	print(occur)
	return ret

if __name__ == '__main__':
	string=input("enter a string to find the first recurring character")
	print(first_rec(string))