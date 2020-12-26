from collections import Counter
n=int(input())
a=list(map(int,input().split()))
m=int(input())
b=list(map(int,input().split()))
a=Counter(a)
ans=[]
for i in b:
    if i in a:
        ans.append(str(a[i]))
    else:
        ans.append(str(0))
print(' '.join(ans))
