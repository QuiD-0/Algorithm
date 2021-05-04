def count(li, m):
    t = cnt = 0
    for n in li:
        if t+n > m:
            t = n
            cnt += 1
        else:
            t += n
    return cnt+1

N, M = map(int, input().split())
li = [int(input()) for _ in range(N)]
s, e = max(li), sum(li)
res = 0
while s <= e:
    m = (s+e)//2
    if count(li, m) <= M:
        res = m
        e = m-1
    else:
        s = m+1
print(res)