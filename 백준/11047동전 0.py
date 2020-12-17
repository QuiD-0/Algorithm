x,won=map(int,input().split())
a=[int(input()) for _ in range(x)]
sum=0
for i in range(x-1,-1,-1):
    sum=sum+won//a[i]
    won=won%a[i]
    print(i)
print(sum)
