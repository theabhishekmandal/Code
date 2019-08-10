if __name__ == "__main__":
    for _ in range(int(input().strip())):
        n, k = list(map(int, input().strip().split()))
        answer = n / k
        if (answer % k) == 0:
            print("NO")
        else:
            print("YES")