t=int(input().strip())
save=''
for _ in range (t):
	n,p=list(int(i) for i in input().strip().split(' '))
	solve=list(int(i) for i in input().strip().split(' '))
	cake=0
	hard=0
	for i in solve:
		if i >= p//2:
			cake+=1
		elif i <=p//10:
			hard+=1
	if hard==2 and cake==1:
		save+='yes'+'\n'
	else:
		save+='no'+'\n'
print(save)