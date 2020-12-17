x=list(map(int,input().split()))
y=list(map(int,input().split()))
j=1
k=2
res=[]
for i in range(x[0]):
    for j in range(i,x[0]):
        for k in range(j,x[0]):
            if i==j or i==k or j==k:
                continue
            elif y[i]+y[j]+y[k]<=x[1]:
                res.append(y[i]+y[j]+y[k])
print(max(res))
