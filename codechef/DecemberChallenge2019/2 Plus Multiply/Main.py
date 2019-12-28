for _ in range(int(input().strip())):
    input()
    arr = list(map(int, input().strip().split(' ')))
    counttwo = 0
    countzero = 0
    for i in arr:
        if i == 0:
            countzero += 1
        elif i == 2:
            counttwo += 1
    print("{}".format((countzero * (countzero - 1) // 2) + (counttwo * (counttwo - 1)) // 2))