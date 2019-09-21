class List:
    class Node:
        def __init__(self, previous, data, next):
            self.data = data
            self.previous = previous
            self.next = next
        def __str__(self):
            return "[" + str(self.data) + "]"

    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def getHead(self):
        return self.head
    
    def getTail(self):
        return self.tail

    def addLast(self, data)->None:
        last = self.tail
        newnode = self.Node(last, data, None)
        self.tail = newnode
        if last is None:
            self.head = newnode
        else:
            last.next = newnode
        self.size += 1

    def addFirst(self, data)-> None:
        first = self.head
        newnode = self.Node(None, data, first)
        self.head = newnode
        if first is None:
            self.tail = newnode
        else:
            first.previous = newnode
        self.size += 1

    def __str__(self):
        temp = self.head
        answer = "["
        while temp != None:
            answer += str(temp.data)
            if temp.next is not None:
                answer += ", "
            temp = temp.next
        return answer + "]"
    def __len__(self):
        return self.size
        

def addToNumbers(first:List, second:List)-> List:
    carry = 0
    temp = List()
    first = first.getTail()
    second = second.getTail()
    while first is not None or second is not None:
        if first is not None:
            carry += first.data
            first = first.previous
        if second is not None:
            carry += second.data
            second = second.previous
        temp.addFirst(carry % 10)
        carry //= 10
    if carry > 0:
        temp.addFirst(carry)
    return str(temp)
        

if __name__ == '__main__':
    first = List()
    first.addFirst(1)
    first.addFirst(1)
    first.addFirst(1)

    second = List()
    second.addFirst(2)
    second.addFirst(3)

    print(addToNumbers(first, second))
