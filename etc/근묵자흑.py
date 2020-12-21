import sys
a,b=map(int,sys.stdin.readline().split())
c=list(map(int,sys.stdin.readline().split()))
count=1
a-=b
k,m=divmod(a,b-1)
count+=k
if m>0:
    count+=1
print(count)
