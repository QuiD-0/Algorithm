def find_fixed(start,end,arr):
    while start<=end:
        mid=(start+end)//2
        if arr[mid]<mid:
            start=mid+1
        else:
            end=mid-1
    return mid if arr[mid]==mid else -1

n=int(input())
array=[i for i in list(map(int,input().split()))]
print(find_fixed(0,len(array)-1,array))