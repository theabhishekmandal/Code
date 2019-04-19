
def twoSum(arr : list, target : int) -> list:
    map = {}
    for i in range(len(arr)):
        diff = target - arr[i]
        if diff in map:
            return [map[diff], i]
        map[arr[i]] = i 

if __name__ == '__main__':
    target = int(input().strip())
    arr = list(map(int, input().strip().split(" ")))
    print(twoSum(arr, target))
