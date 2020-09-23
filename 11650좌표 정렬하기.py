x=int(input())
a=[]
for i in range(x):
    a.append(str(input()))
a=sorted(a,key=lambda x:(int(x.split()[0]),int(x.split()[1])))
for i in range(x):
    print(a[i])
