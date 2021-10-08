def rec(arr,x,y,size):
    flag=True
    first=arr[x][y]
    for i in range(size):
        for j in range(size):
            if first!=arr[i+x][j+y]:
                flag=False
    if not flag:
        rec(arr,x,y,size//2)
        rec(arr,x+size//2,y,size//2)
        rec(arr,x,y+size//2,size//2)
        rec(arr,x+size//2,y+size//2,size//2)
    else:
        result.append(arr[x][y])

def solution(arr):
    global result
    result=[]
    rec(arr,0,0,len(arr))
    answer = [result.count(0),result.count(1)]
    return answer