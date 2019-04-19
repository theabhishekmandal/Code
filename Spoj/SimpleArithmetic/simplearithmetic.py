def addspace(string,length, n):
	for i in range(length):
		if n == 0:
			string = ' ' + string
		else:
			string = string + ' '
	return string

def call(first, second, third):
	firstdashes = '-' * max(firstlen, secondlen, len(third))
	first = addspace(first, len(firstdashes) - len(first), 0)
	second = addspace(second, len(firstdashes) - len(second), 0)
	third = addspace(third, len(firstdashes) - len(third), 0)
	solve(first, second,firstdashes, third)
	print(first)
	print(second)
	print(firstdashes)
	print(third)
	print()

def solve(*args):
	for i in args:
		print(i)
	print()

if __name__ == '__main__':
	for _ in range(int(input().strip())):
		first = ''
		second = ''
		third = ''
		oper = ''
		num1 = 0
		num2 = 0
		output = []
		op = ['+', '-', '*']
		exper = input().strip()
		for i in exper:
			if i in op:
				oper = i
				save = exper.split(i)
				first = save[0]
				num1 = int(first)
				num2 = int(save[1])
				second = oper + save[1]
				break
		firstlen = len(first)
		secondlen = len(second)
		firstdashes = '-' * max(firstlen, secondlen)		

		if oper == '+':
			third = str(num1  + num2)
			call(first,second,third)
		elif oper == '-':
			third = str(num1  - num2)
			call(first,second,third)
		elif oper == '*':
			# adding space from back if the second number is greater than 9
			if num2 > 9:
				for i in (str(num2)[::-1]):
					output.append(str(num1 * int(i)))

			# getting the string representation of the multiplication of the number
			third = str(num1 * num2)
			length = max(firstlen, secondlen, len(third))
			# formatting by adding spaces in the front
			first = addspace(first, length - len(first), 0)
			second = addspace(second, length - len(second), 0)
			third = addspace(third,length - len(third), 0)
			firstdashes = addspace(firstdashes, length - len(firstdashes), 0)
			
			# creating new dashes
			newdashes = '-' * length
			# adding spaces only at the front
			k = 0
			aux = ''
			for i in range(len(output)):
				output[i] = addspace(output[i], length - len(output[i]) - k, 0)
				aux += output[i] + '\n' 
				k += 1 
			if num2 > 9:
				solve(first, second, firstdashes, aux[:len(aux) - 1:], newdashes, third)
			else:
				solve(first, second, newdashes, third)



