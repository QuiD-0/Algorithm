a=list(map(int,input().split()))
b=[]
b.append(a[0])
b.append(a[1])
b.append(a[2]-a[0])
b.append(a[3]-a[1])
print(min(b))
