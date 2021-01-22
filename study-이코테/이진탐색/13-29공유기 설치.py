n,c=map(int,input().split())
arr=[int(input()) for _ in range(n)]
arr.sort()
start,end=1,arr[-1]-arr[0]
ans=0

while start<=end:
    mid= (start+end)//2
    count=1
    now=arr[0]
    for i in range(1,n):
        if arr[i]-now>=mid:
            count+=1
            now=arr[i]
    if count>=c:
        start=mid+1
        ans=mid
    else:
        end=mid-1
print(ans)