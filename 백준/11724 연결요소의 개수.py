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

a,b= map(int,input().split())
node=[i for i in range(a+1)]
for i in range(b):
    x,y=map(int,input().split())
    union(x,y)
for i in range(1,1+a):
    find(i)
result = set(node[1:])
print(len(result))