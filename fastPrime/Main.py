import time
import sys
start = stop = 0.0

def eprint(*args, **kwargs):
    print(*args, file=sys.stderr, **kwargs)

def startime():
    global start
    start = time.time()

def stoptime():
    global stop
    stop = time.time()

def gettime():
    global start, stop
    stop = stop - start
    eprint(str(float(stop)) + " " + "seconds")

# This is not fast as division operator takes time
def fastPrime1(num : int)-> list:
    prime = [True] * (num + 1)
    prime[0], prime[1] = False, False
    for i in range(4, num + 1):
        if prime[i] is False:
            continue
        if (i & 1) == 0 or i % 3 == 0:
            prime[i] = False
        else:
            for j in range(5, (int)((i ** 0.5) + 1), 6):
                if i % j == 0 or i % (j + 2) == 0:
                    prime[i] = False
    arr = []
    for i in range(2, num + 1):
        if prime[i] is True:
            arr.append(i)
    return arr

# This is fast because no division is taking place
def fastPrime2(num : int)-> list:
    prime = [True] * (num + 1)
    prime[0], prime[1] = False, False
    for i in range(2, num + 1):
        if prime[i] is False:
            continue
        else:
            for j in range(i * i, num + 1, i):
                prime[j] = False
    arr = []
    for i in range(2, num + 1):
        if prime[i] is True:
            arr.append(i)
    return arr
    
if __name__ == "__main__":
    startime()
    arr = fastPrime1(10000000)
    stoptime()
    print(arr)
    gettime()

    startime()
    arr = fastPrime2(10000000)
    stoptime()
    print(arr)
    gettime()