n,m=map(int,input().split())
arr=list(map(int,input().split()))
arr.sort()
start=0
end=arr[-1]
while start<end:
    mid=(start+end)//2
    total=0
    print(start,mid,end)
    for i in arr:
        if i>mid:
            total+=i-mid
    if total<m:
        end=mid-1
    else:
        result=mid
        start=mid+1
print(result)