if __name__ == '__main__':
    arr = []
    br = ''
    for _ in range(int(input().strip())):
        blah = input().strip().split(' ')
        if blah[0] is '1':
            arr.append([blah[0], str(len(blah[1]))])
            br += blah[1]
        elif blah[0] is '2':
            val = int(blah[1])
            arr.append([blah[0], br[len(br) - val:]])
        elif blah[0] is '3':
            print(br[int(blah[1]) - 1])
        elif blah[0] is '4':
            if len(arr) is not 0:
                ob = arr[len(arr) - 1]
                if ob[0] is '1':
                    br = br[:len(br) - int(ob[1])]
                elif ob[0] is '2':
                    br += ob[1]
                arr = arr[:len(arr) - 1]
