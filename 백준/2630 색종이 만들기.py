def div(x,y,size):
    a=set()
    for i in range(size):
        for j in range(size):
            a.add(mat[x+i][y+j])
    if len(a)==2:
        div(x,y,size//2)
        div(x+size//2,y,size//2)
        div(x,y+size//2,size//2)
        div(x+size//2,y+size//2,size//2)
    else:
        ans[mat[x][y]]+=1

n=int(input())
mat=[]
for _ in range(n):
    mat.append([i for i in map(int,input().split())])
ans=[0,0]
div(0,0,n)
print(ans[0])
print(ans[1])