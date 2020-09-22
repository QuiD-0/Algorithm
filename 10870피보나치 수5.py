def fi(a):
    if a==1:
        return 1
    if a==2:
        return 1
    return fi(a-1)+fi(a-2)      
i=int(input())
if i==0:
    print(0)
else:
    print(fi(i))
