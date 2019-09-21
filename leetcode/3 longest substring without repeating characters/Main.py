if __name__ == "__main__":
    string = input().strip()
    if len(string) == 0:
        print(0)
        exit(0)
    map = {}
    start = 0
    maxi = int(-1e9)
    for i in range(len(string)):
        if string[i] in map:
            if map[string[i]] >= start:
                start = map[string[i]] + 1
        map[string[i]] = i
        maxi = max(maxi, i - start + 1)
    print(maxi)