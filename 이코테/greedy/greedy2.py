#큰수의 법칙

n,m,k=map(int,input().split())
num=list(map(int,input().split()))
result=0
num.sort(key=int,reverse=True)
for i in range(m):
    if i%(k+1)==k:
        result+=num[1]
    else:
        result+=num[0]
print(result)
    
