x=int(input())
a=[0 for _ in range(1000000)]
a[0]=1
a[1]=2
for i in range(2,1000000):
    a[i]=(a[i-1]+a[i-2])%15746
print(a[x-1])
