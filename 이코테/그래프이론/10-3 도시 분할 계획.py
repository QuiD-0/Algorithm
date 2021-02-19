# https://www.acmicpc.net/problem/1647
def find(a):
    if a!=node[a]:
        node[a]=find(node[a])
    return node[a]

def union(a,b):
    a=find(a)
    b=find(b)
    if a<b:
        node[b]=a
    else:
        node[a]=b


import heapq 
import sys

input=sys.stdin.readline
n,m=map(int,input().split())
node=[i for i in range(n+1)]
edge=[]

for _ in range(m):
    a,b,cost=map(int,input().split())
    heapq.heappush(edge,(cost,a,b))
result=0
last=0
while edge:
    cost,a,b=heapq.heappop(edge)
    if find(a)!=find(b):
        union(a,b)
        result+=cost
        last=cost
print(result-last)