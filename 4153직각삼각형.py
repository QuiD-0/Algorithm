a=list(map(int,input().split()))
while max(a)!=0:
    b=max(a)
    if a[0]**2+a[1]**2+a[2]**2-max(a)**2==max(a)**2:
        print('right')
    else:
        print('wrong')
    a=list(map(int,input().split()))
