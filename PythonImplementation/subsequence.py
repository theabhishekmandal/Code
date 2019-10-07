name = input().strip()
print("\n".join(name[i: i + j] for i in range(len(name)) for j in range(1, len(name) + 1 - i)))