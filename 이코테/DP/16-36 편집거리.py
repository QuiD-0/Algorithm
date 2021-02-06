a=input()
b=input()
d=[[i for i in range(j,len(a)+1+j)] for j in range(len(b)+1)]
for i in range(1,len(b)+1):
    for j in range(1,len(a)+1):
        d[i][j] = d[i-1][j-1] if a[j-1]==b[i-1] else min(d[i-1][j-1],min(d[i][j-1],d[i-1][j]))+1
print(d[-1][-1])