a,b=map(int,input().split())
n=int(input())
num=[i for i in list(map(int,input().split()))]
dec=0
for i in range(n):
    dec+=a**(n-1-i)*num[i]
ans=[]
n=dec
while True:
    if n==0:
        break
    n,d=divmod(n,b)
    ans.append(str(d))
print(' '.join(ans[::-1]))