x=int(input())
a=[0 for _ in range(100)]
a[0]=1
a[1]=1
a[2]=1
for i in range(3,100):
    a[i]=(a[i-3]+a[i-2])
for j in range(x):
    t=int(input())
    print(a[t-1])
