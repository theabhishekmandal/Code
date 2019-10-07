class hello:
	def __init__(self,val,incre):
		self.val=val
		self.incre=incre
	def helloTest(self):
		self.val+=self.incre
if __name__ == '__main__':
	a=hello(10,12)
	a.increase()
	print(a)
