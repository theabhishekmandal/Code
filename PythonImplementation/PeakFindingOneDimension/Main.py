"""
    peak finding algorithm for 1 dimension array
"""

def getPeak(arr : list) -> int:
    low = 0
    length = len(arr)
    high = length - 1
    while low <= high:
        mid = low + ((high - low) >> 1)

        # always check the mid condition first
        if (mid == 0  or arr[mid - 1] <= arr[mid]) and (mid == length - 1 or arr[mid + 1] <= arr[mid]):
            return arr[mid]
        elif mid + 1 < length and arr[mid + 1] < arr[mid]:
            high = mid - 1
        else:
            low = mid + 1
arr = list(map(int, input("enter an array of elements ").strip().split()))
print(getPeak(arr))
