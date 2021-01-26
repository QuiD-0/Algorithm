def swap(idx):
    if arr[idx]>arr[idx+1]:
        arr[idx],arr[idx+1]=arr[idx+1],arr[idx]
        return True
    return False

arr=list(map(int,input().split()))
b=arr[:]
b.sort()
while True:
    for i in range(0,4):
        if swap(i):
            print(' '.join(list(map(str,arr))))
    if arr==b:
        break