t=int(input())
for _ in range(t):
    n=int(input())
    a=list(map(int,input().split()))
    b={}
    for i in a:
        b[i]=1
    n=int(input())
    c=list(map(int,input().split()))
    for i in c:
        print(1) if i in b.keys() else print(0)
        