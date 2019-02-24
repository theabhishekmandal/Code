def compute(pattern):
	lps = [0] * len(pattern)
	i = 1
	j = 0
	while i < len(pattern):
		if pattern[i] == pattern[j]:
			lps[i] = j + 1
			j += 1
			i += 1
		else:
			if j > 0:
				j = lps[j - 1]
			else:
				i += 1
	return lps
def findsubstring(text, pattern):
	lps = compute(list(pattern))
	i = 0 # for text
	j = 0 # for pattern
	while i < len(text):
		if text[i] == pattern[j]:
			i += 1
			j += 1
		elif text[i] != pattern[j]:
			if j > 0:
				j = lps[j - 1]
			else:
				i += 1
		if j == len(pattern):
			print("match  found at", i - j)
			j = lps[j - 1]

if __name__ == '__main__':
	text = input().strip()
	pattern = input().strip()
	findsubstring(text, pattern)