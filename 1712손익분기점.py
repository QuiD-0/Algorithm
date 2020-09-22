a=list(map(int,input().split()))
if a[1]>=a[2]:
    print(-1)
else:
    x=a[0]/(a[2]-a[1])+1
    print(int(x))
