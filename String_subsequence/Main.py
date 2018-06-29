# printing all the sub sequences
ab = input().strip()
print("\n".join(str(k) for k in [ab[i: i + j] for i in range(0, len(ab)) for j in range(1, len(ab) + 1) if i + j <= len(ab)]))
