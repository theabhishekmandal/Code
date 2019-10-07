stack=[]
top=-1

def push(value):
	global top,stack
	top=top+1
	stack.append(value)


def pop():
	global top,stack
	if top <= -1:
		print('no more elements to pop')
		return
	else:
		print(stack[top])
		top=top-1

def show():
	global top,stack
	for i in range(top+1):
		print(stack[i],end=' ')



n=int(input('enter the number of elements of the stack'))
for i in range(n):
	push(int(input()))
	
k=int(input('enter how many to delete'))
for i in range(k):
	pop()

print('show elements of the stack')
show()





