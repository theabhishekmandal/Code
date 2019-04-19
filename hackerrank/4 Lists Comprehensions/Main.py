x = int(input().strip()) + 1
y = int(input().strip()) + 1
z = int(input().strip()) + 1
n = int(input().strip())
print([[i, j, k] for i in range(0, x) for j in range(0, y) for k in range(0, z) if i + j + k != n])