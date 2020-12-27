from collections import defaultdict as c
n,m=map(int,input().split())
a=c(list)
for _ in range(m):
    x,y=map(int,input().split())
    a[y].append(x)
print(a)
find=int(input())
count=1
while True:
    if a[find]:
        find=a[find].pop(0)
        count+=1
    else:
        print(count)
        break
        
    
        
