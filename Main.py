def myfunc(arr):
    string = ''
    function = [lambda x : x.lower(), lambda y : y.upper()]
    for i in range(0, len(arr)):
        string += function[i & 1](arr[i])
    return string
print(myfunc("ab"))
print(myfunc("abC"))
