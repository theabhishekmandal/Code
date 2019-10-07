class Node:
	def __init__(self,data:int)->None:
		self.data=data
		self.next=None
		self.previous=None


class DoubleLinkedList:
	def __init__(self)->None:
		self.head=None


	def append(self,data:int)->None:

		if self.head is None:
			self.head=Node(data)
		else:
			temp=self.head
			while temp.next is not None:
				temp=temp.next
			node=Node(data)
			node.previous=temp
			temp.next=node

	def prepend(self,data:int)->None:
		if self.head is None:
			self.head=Node(data)
		else:
			node=Node(data)
			node.next=self.head
			self.head.previous=node
			self.head=node

	def show(self)->None:
		if self.head is None:
			return print("nothing to show it's empty")
		else:
			temp=self.head
			while temp is not None:
				print(temp.data,"-->",end='')
				temp=temp.next
			print()

if __name__ == '__main__':
	ob=DoubleLinkedList()
	ob.append(10)
	ob.append(10)
	ob.append(10)
	ob.append(10)
	ob.show()
	ob.prepend(20)
	ob.show()