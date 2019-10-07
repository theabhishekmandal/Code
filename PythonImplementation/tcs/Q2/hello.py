class student:
	def __init__(self, rollno:int, name:str, score:int)->None:
		self.rollno = rollno
		self.name = name
		self.score = score
		self.grade = None
	def findgrade(self)->None:
		if self.score >= 80:
			self.grade = 'A'
		elif self.score >= 60 and self.score < 80:
			self.grade = 'B'
		elif self.score >= 50 and self.score < 60:
		 	self.grade = 'C'
		else: self.grade = 'F'
	def display(self)-> None:
		print(self.rollno)
		print(self.name)
		print(self.grade)
if __name__ == '__main__':
	ob = student(11, 'Abhishek', 80)
	ob1 = student(12, 'dfsaslkkj', 45)
	ob.findgrade()
	ob1.findgrade()
	ob.display()
	ob1.display()
	