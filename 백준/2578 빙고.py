def check():
    count=0
    for i in mat:
        if len(i)==0:
            count+=1
    return count

mat=[]
for _ in range(5):
    mat.append([i for i in list(map(int,input().split()))])
b=[]
c=[]
for i in range(5):
    a=[]
    for j in range(5):
        if i==j:
            b.append(mat[i][j])
        if i+j==4:
            c.append(mat[i][j])
        a.append(mat[j][i])
    mat.append(a)
mat.append(b)
mat.append(c)
que=[]
for _ in range(5):
    que.extend([i for i in list(map(int,input().split()))])
for idx,key in enumerate(que):
    if check()>=3:
        print(idx)
        break
    for bingo in mat:
        if key in bingo:
            bingo.remove(key)
            
