n,m= map(int,input().split())
a=[i for i in map(int,input().split())]
low=0
high=max(a)
while low <= high:
    mid = (low + high)//2 
    sum=0
    for i in a:
        if i-mid >0:
            sum+=(i-mid)      
    if sum >= m:
        low=mid+1
    else:
        high=mid-1
print(high)

