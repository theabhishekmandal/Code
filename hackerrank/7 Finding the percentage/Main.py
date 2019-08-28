import statistics
if __name__ == "__main__":
    size = int(input().strip())
    arr = {}
    for _ in range(size):
        name, *marks = input().strip().split(" ")
        arr[name] = list(map(float, marks))
    nameToFind = input().strip()
    print('%.2f'%(statistics.mean(arr[nameToFind])))