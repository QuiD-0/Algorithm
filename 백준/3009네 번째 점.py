a=list(map(int,input().split()))
b=list(map(int,input().split()))
c=list(map(int,input().split()))
d=[]
e=[]
re=[]
d.append(a[0])
e.append(a[1])
d.append(b[0])
e.append(b[1])
d.append(c[0])
e.append(c[1])

if d.count(d[0])==1:
    re.append(d[0])
elif d.count(d[1])==1:
    re.append(d[1])
else:
    re.append(d[2])
    
if e.count(e[0])==1:
    re.append(e[0])
elif e.count(e[1])==1:
    re.append(e[1])
else:
    re.append(e[2])
print(re[0],re[1])
