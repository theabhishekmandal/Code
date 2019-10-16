'''
    Skip list:
        Maintains a dynamic set of n elements in o(log n)
        time per operation in expectation and with high probability
        result

    1------>3------>5 l1
    1-->2-->3-->4-->5 l0

    Search(x): with 2 linked list
        walk right in top linked list (l1)
        until going right would go too far.

        walk down to the bottom list (lo).

        walk right in lo until element is found (or not)

    Analysis:
        Search complexity is = len(l1) + len(l0)/len(l1) 
        because some portions of l0 will be traversed

        Number of elements in top list or l1 will be square
        root of number of elements in l0 list

        search cost is = O(sqrt(n)) where n is the length
        of the list

    Sorted list with each level decreasing level
        14----------------------------->79 l4
        14------------->50------------->79 l3
        14----->34----->50----->66----->79 l2
        14->23->34->42->50->59->66->72->79 l1

    But the above list is looking regular, but what 
    happens when we insert or delete an element.
    This regularness will disappear

    Search cost for diff list                
        2 sorted list      :   2 sqrt(n)
        3 sorted list      :   3 cuberoot(n)
        '
        '
        '
        k sorted list      :   k kthroot(n)

        so the number of levels will be lg(n)

        lg(n) sorted list   :   lgn(n) lg(n)rootOf(n) == 2 lg(n)

        where n is power of 2

    Insert(x):
        To insert an element x to the skip list
        search(x) to see where it fits into the bottom list

        Always insert to the bottom list

        Insert in some of the lists above(which ones?)
            Flip fair coin:
                if heads promote x to next level, up and repeat
                else:
                    stop


    Delete(x):
        Search(x) and delete node at all levels

'''

class SkipList:
    def __init__(self):
        self.list = []