n,m=map(int,input().split())
see=set()
for i in range(n):
    see.add(input())
ans=[]
for i in range(m):
    b=input()
    if b in see:
        ans.append(b)
print(len(ans))
ans.sort(key=str)
for i in ans:
    print(i)