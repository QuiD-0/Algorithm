def find(x):
    if x != root[x]:
        root[x]=find(root[x])
    return root[x] 
def union(x,y):
    a=find(x)
    b=find(y)
    if a<b:
        root[b]=a
    else:
        root[a]=b

def is_union(x,y):
    print("yes" if find(x)==find(y) else "no")


n,m=map(int,input().split())
root=[i for i in range(n+1)]
for _ in range(m):
    a,b,c=map(int,input().split())
    if a:
        is_union(b,c)
    else:
        union(b,c)