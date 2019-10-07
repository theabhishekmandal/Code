if __name__ == '__main__':
	name = input("enter the file name to be added\n")
	with open(name , 'w+') as file:
		with open("hello.txt", 'r') as f:
			read = f.read()
			file.write(read)
		