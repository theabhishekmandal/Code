val = []
val[len(val) + 1] = 2**i + 2**j for i in range(0, 31) for j in range(0, 31) if i != j
val.sort()
for _ in range(int(input().strip())):
    n = int(input().strip())