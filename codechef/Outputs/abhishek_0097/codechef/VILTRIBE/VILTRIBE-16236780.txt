if __name__ == '__main__':
	save=''
	for i in range(int(input().strip())):
		s=input().strip()
		i,a,b=0,0,0
		while i<len(s) and s[i]=='.':
			i+=1
		if i==len(s):
			save+=str(a)+' '+str(b)+'\n'
		else:
			j=i
			for i in range(len(s)):
				if s[i]!='.':
					if s[i]=='A':
						a+=1
					else:
						b+=1
					if s[i]==s[j] and i!=j:
						if s[i]=='A':
							a+=i-j-1
						else:
							b+=i-j-1
					j=i
			save+=str(a)+' '+str(b)+'\n'
	print(save)