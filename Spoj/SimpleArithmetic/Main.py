def addspace(string,length):
	for i in range(length):
		string = ' ' + string
	return string

def solve(*args):
	for i in args:
		if i != '':
			print(i)
	print()

if __name__ == '__main__':
	for test in range(int(input().strip())):
		first, second, third, oper, firstdashes, newdashes = ('',) * 6
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
        
		if oper == '+':
			third = str(num1  + num2)
		elif oper == '-':
			third = str(num1  - num2)
		elif oper == '*':
			third = str(num1 * num2)
			# adding space from back if the second number is greater than 9
			if num2 > 9:
				for i in (str(num2)[::-1]):
					output.append(str(num1 * int(i)))

		# max length of the string needed to format the inbetween results of multiplication
		length = max(len(third), len(first), len(second))


		# setting the inital dashes
		if oper == '*':
			# the initial dashes would be the max of the second and the first multiplication result
			firstdashes = '-' * max(len(output[0]) if num2 > 9 else len(third), len(second))
			# the newdashes would be max of the last output of the multiplication and the third
			newdashes = '-' * max(len(output[len(output) - 1]), len(third)) if num2 > 9 else '' 
		else:
			firstdashes = '-' * max(len(third), len(second))

		# formatting all the inputs
		first = addspace(first, length - len(first))
		second = addspace(second, length - len(second))
		firstdashes = addspace(firstdashes, length - len(firstdashes))

		'''
		new dashes should be formatted, two points should be check while formatting them
		1: that newdashes should be formatted for only multiplication cases only
		2: it should only be done for those cases in which number of digits to be multiplied is greater than 9
		'''
		newdashes = addspace(newdashes, length - len(newdashes)) if oper == '*' and num2 > 9 else ''		
		third = addspace(third, length - len(third))		

		# adding spaces to the in between results of multiplication
		k = 0
		aux = ''
		for i in range(len(output)):
			output[i] = addspace(output[i], length - len(output[i]) - k)
			if i < len(output) - 1:
				aux += output[i] + '\n'
			else:
					aux += output[i] 
			k += 1 

		solve(first, second, firstdashes, aux, newdashes, third)









