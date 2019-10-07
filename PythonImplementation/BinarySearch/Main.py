'''
    Binary search implementation
'''

def binarySearch(arr : list, key : int) -> int:
    low = 0
    high = len(arr) - 1
    while(low <= high):
        mid = low + ((high - low) >> 1)
        if(arr[mid] == key):
            return mid
        elif arr[mid] < key:
            low = mid + 1
        else:
            high = mid - 1
    return -1
arr = sorted(list(map(int, input('enter array ').strip().split())))
for i in arr:
    print("key = " + str(i) + " index is " + str(binarySearch(arr, i)))
print("key = " + str(100) + " index is " + str(binarySearch(arr, 100)))