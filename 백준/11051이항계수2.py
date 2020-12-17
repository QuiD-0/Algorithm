a=list(map(int,input().split()))
ma=max(a)
fac=[1]*(ma+1)
for i in range(1,ma+1):
    fac[i]=fac[i-1]*i
res=fac[a[0]]//(fac[a[1]]*fac[a[0]-a[1]])
print(res%10007)

