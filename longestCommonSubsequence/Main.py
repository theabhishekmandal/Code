def longestCommonSubsequence(one : str, two : str) -> int:
    onelength = len(one)
    twolength = len(two)
    arr = [[0] * (twolength + 1) for _ in range(onelength + 1)]
    for i in range(onelength + 1):
        for j in range(twolength + 1):
            if i is 0 or j is 0:
                continue
            elif one[i - 1] == two[j - 1]:
                arr[i][j] = 1 + arr[i - 1][j - 1]
            else:
                arr[i][j] = max(arr[i - 1][j], arr[i][j - 1])
    return arr[onelength][twolength]

def longestCommonSubsequenceCompact(one : str, two : str) -> int:
    onelength, twolength = len(one), len(two)
    arr = [[0] * (twolength + 1) for _ in range(onelength + 1)]
    for i in range(onelength + 1):
        for j in range(twolength + 1):
            arr[i][j] = 0 if i is 0 or j is 0 else 1 + arr[i - 1][j - 1] if one[i - 1] == two [j - 1] else max(arr[i - 1][j], arr[i][j - 1])
    return arr[onelength][twolength]
one, two = input().strip().split(" ")
print(longestCommonSubsequence(one, two))
print(longestCommonSubsequenceCompact(one, two))