x=int(input())
a=[0 for _ in range(91)]
a[0]=0
a[1]=1
for i in range(2,91):
    a[i]=a[i-1]+a[i-2]
print(a[x])
