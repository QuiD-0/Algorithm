def find_left(start,end,arr,target):
    while start<end:
        mid=(start+end)//2
        if arr[mid]<=target:
            end=mid-1
        else:
            start=mid+1
    return mid if arr[mid+1]==target else -1

def find_right(start,end,arr,target):
    while start<end:
        mid=(start+end)//2
        if arr[mid]>=target:
            start=mid+1
        else:
            end=mid-1
    return mid if arr[mid-1]==target else -1
    
n,m=map(int,input().split())
array=[i for i in list(map(int,input().split()))]
a=find_left(0,len(array)-1,array,m)
b=find_right(0,len(array)-1,array,m)
if a==-1:
    print(a)
else:
    print(b-a)