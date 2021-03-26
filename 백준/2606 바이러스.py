def find(a):
    if node[a]!=a:
        node[a]=find(node[a])
    return node[a]

def union(x,y):
    a=find(x)
    b=find(y)
    if a<b:
        node[b]=a
    else:
        node[a]=b

n=int(input())
m=int(input())
node=[i for i in range(n+1)]
for i in range(m):
    a,b=map(int,input().split())
    union(a,b)
count=0
for i in range(1,n+1):
    if find(i)==1:
        count+=1
print(count-1)