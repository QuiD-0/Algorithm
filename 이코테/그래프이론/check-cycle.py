
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
c=True
node=[i for i in range(a+1)]
for i in range(b):
    x,y=map(int,input().split())
    if find(x)==find(y):
        print("cycle")
        c=False
        break
    else:
        union(x,y)
if c:
    print("not cycle")