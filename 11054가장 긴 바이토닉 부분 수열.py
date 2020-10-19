x=int(input())
a=list(map(int,input().split()))
up=[1 for _ in range(x)]
down=[1 for _ in range(x)]
for i in range(1,x):
    for j in range(i):
        if a[i]>a[j]:
            up[i]=max(up[i],up[j]+1)
for i in range(x-1,0,-1):
    for j in range(i,x):
        if a[i]>a[j]:
            down[i]=max(down[i],down[j]+1)
result=[up[i]+down[i]-1 for i in range(x)]

print(max(result))
