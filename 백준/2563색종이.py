n=int(input())
arr=[[0]*101 for _ in range(101)]
for i in range(n):
    a,b=map(int,input().split())
    for x in range(a,a+10):
        for y in range(b,b+10):
            arr[x][y]=1
ans=0
for i in arr:
    ans+=sum(i)
print(ans)