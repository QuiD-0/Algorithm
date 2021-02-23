def find(a):
    if root[a]!=a:
        root[a]=find(root[a])
    return root[a]

def union(a,b):
    a=find(a)
    b=find(b)
    if a>b:
        root[a]=b
    else:
        root[b]=a

n,m=map(int,input().split())
root=[i for i in range(n)]
for i in range(n):
   for idx,j in enumerate(list(map(int,input().split()))):
       if j==1:
           union(i,idx)
route=list(map(int,input().split()))
result = True
for i in range(m-1):
    if find(route[i]-1)!=find(route[i+1]-1):
        result = False
print("YES" if result==True else "NO")
