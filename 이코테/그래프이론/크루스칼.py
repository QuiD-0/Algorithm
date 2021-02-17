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

v, e = map(int, input().split())
node=[i for i in range(v+1)]
edge=[]
result=0

for _ in range(e):
    a,b,cost=map(int,input().split())
    edge.append((cost,a,b))
edge.sort(key=lambda x:(x[0],x[1]))

for i in edge:
    cost,a,b=i
    if find(a)!=find(b):
        union(a,b)
        result+=cost
        print(a,b)
print(result)

'''
입력
7 9
1 2 29
1 5 75
2 3 35
2 6 34
3 4 7
4 6 23
4 7 13
5 6 53
6 7 25

출력
159
'''

