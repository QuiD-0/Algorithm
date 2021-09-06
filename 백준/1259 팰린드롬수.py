
while True:
    a=input()
    if (a=='0'):
        break
    if (a==''.join(list(a)[::-1])):
        print("yes")
    else:
        print('no')