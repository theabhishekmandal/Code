size = input().strip()
arr = {}
for i in input().strip().split(" "):
    arr[int(i)] = 1
print(sorted(arr, reverse=True)[1] if len(arr) > 1 else next(iter(arr.keys())))

