import collections
import math
a=int(input())
li=[]
for i in range(a):
    li.append(int(input()))
li=sorted(li,key=int)
print(round(sum(li)/a))
print(li[a//2])
ll=collections.defaultdict(list)
ll=list(li)    
b=collections.Counter(ll)
if a!=1:
    if b.most_common(2)[0][1]==b.most_common(2)[1][1]:
        print(b.most_common(2)[1][0])
    else:
        print(b.most_common(1)[0][0])
    if li[0]*li[a-1]>0:
        print(abs(li[a-1]-li[0]))
    else:
        print(abs(li[0])+abs(li[a-1]))
else:
    print(li[0])
    print(0)
