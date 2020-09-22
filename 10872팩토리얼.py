def fac(a):
    if a==0:
        return 1
    elif a<=2:
        return a 
    return fac(a-1)*a
i=int(input())
print(fac(i))
