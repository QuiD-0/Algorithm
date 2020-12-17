import sys
input = sys.stdin.readline

a, b = map(int,input().strip().split())
al = []
bl = []
for i in range(a):
    if (a%(i+1)) == 0 :
        al.append(i+1)
    else :
        continue

for i in range(b):
    if (b%(i+1)) == 0 :
        bl.append(i+1)
    else :
        continue

al = set(al)
bl = set(bl)

c = al&bl
c = list(c)
ans = 1
c.sort(key=int)
ans = (a//c[-1])*b

print(c[-1])
print(ans)
