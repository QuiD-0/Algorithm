x=int(input())
a=list(map(int,input().split()))
a.sort(key=int)
sum=0
for i in range(x):
    sum+=a[i]*(x-i)
print(sum)
