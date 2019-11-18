input()
arr = list(map(int, input().strip().split(' ')))
maxi, currMax = arr[0], arr[0]
for i in range(1, len(arr)):
    currMax = max(arr[i], currMax + arr[i])
    maxi = max(currMax, maxi)
print(maxi)