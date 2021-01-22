def bin(start,end,arr,target):
    while start<=end:
        mid=(start+end)//2
        if arr[mid]==target:
            return mid
        if target<arr[mid]:
            end=mid-1
        else:
            start=mid+1
    return

n=int(input())
a=list(map(int,input().split()))
a.sort()
m=int(input())
find=list(map(int,input().split()))
ans=[]
for i in find:
    if bin(0,len(a)-1,a,i):
        ans.append("yes")
    else:
        ans.append("no")
print(' '.join(ans))