if __name__ == "__main__":
    size = int(input())
    mini = 1000000000000.0
    arr = {}
    setarr = {}
    for i in range(size):
        name = input().strip()
        marks = float(input().strip())
        mini = min(mini, marks)
        setarr[marks] = 1
        arr[name] = marks
    if size == 1:
        print(next(iter(arr.keys())))
        exit(0)
    for i in sorted(setarr.keys()):
        if i > mini:
            mini = i
            break
    mini = sorted(setarr.keys())[1]
    string  = ''
    for i in sorted(arr.keys()):
        if arr[i] == mini:
            string += i + "\n"
    print(string, end = '')
