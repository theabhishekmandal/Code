'''
    peak finding algorithm for 2 dimension array
'''
def findingPeak(arr : list) -> int:
    low = 0
    high = m
    mid = low + (high - low) // 2
    while low <= high:
        maxum = 0
        index = 0
        for i in range(n):
            if arr[i][mid] > maxum:
                maxum = arr[i][mid]
                index = 0
        if mid + 1 != m and arr[index][mid] < arr[index][mid + 1]:
            low = mid + 1
        elif mid - 1 != 0 and arr[index][mid] < arr[index][mid - 1]:
            high = mid - 1
        else:
            return arr[index][mid]
        mid = low + (high - low) // 2

if __name__ == "__main__":
    n, m = (
        int(i)
        for i in (input("enter row and coulumn space sperated").strip().split(" "))
    )
    arr = []
    for i in range(n):
        arr.append([])
        for j in range(m):
            arr[i].append(input().strip().split(" "))
	findingPeak(arr)


