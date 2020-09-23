n,m=map(int,input().split())
visit=[False]*n
a=[]
def solve():
    if len(a)==m:
        print(' '.join(a))
        return
    for i in range(1,n+1):
        if not visit[i-1]:
            a.append(str(i))
            visit[i-1]=True
            solve()
            visit[i-1]=False
            a.pop()
solve()
            
