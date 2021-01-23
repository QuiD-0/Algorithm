#볼링공 고르기
import itertools
n,m=map(int,input().split())
ball=list(map(int,input().split()))
count=0
for a,b in list(itertools.combinations(ball,2)):
    if a!=b:
        count+=1
print(count)