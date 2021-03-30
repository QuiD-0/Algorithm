from collections import defaultdict as d
for _ in range(int(input())):
    n=int(input())
    r=d(list)
    for i in range(n):
        c,s=map(str,input().split())
        r[s].append(c)
    ans=1
    for i in r.keys():
        ans*=(len(r[i])+1)
    print(ans-1)