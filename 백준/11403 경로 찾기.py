n= int(input())
mat=[]
inf=1000000
for _ in range(n):
    mat.append(list(map(int,input().split())))
for i in range(n):
    for j in range(n):
        if mat[i][j]==0:
            mat[i][j]=inf
for k in range(n):
    for i in range(n):
        for j in range(n):
            if mat[i][j]>mat[i][k]+mat[k][j]:
                mat[i][j]=mat[i][k]+mat[k][j]
for i in range(n):
    for j in range(n):
        if mat[i][j]==inf:
            mat[i][j]=0
        else:
            mat[i][j]=1
for i in mat:
    print(' '.join([str(j) for j in i]))