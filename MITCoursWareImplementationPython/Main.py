'''
    peak finding algorithm for 1 dimension array
'''

arr = list(map(int, input('enter an array of elements ').strip().split()))

low = 0
length = len(arr)
high = length - 1
mid = 0
while low <= high:
    mid = low + (high - low) // 2

    # always check the mid condition first
    if (mid == 0 or arr[mid - 1] <= arr[mid]) and (mid == length - 1 or arr[mid + 1] <= arr[mid]):
        print(arr[mid])
        break
    elif mid + 1 < length and arr[mid] > arr[mid + 1]:
        high = mid - 1
    else:                       # don't put elseif condition here else it won't work
        low = mid + 1