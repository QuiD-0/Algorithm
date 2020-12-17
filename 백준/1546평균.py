sum=0
t=int(input())
li=list(map(int,input().split()))
li.sort()    
max=li[t-1]
for i in range(t):
    li[i]=li[i]/max*100
    sum+=li[i]
print(sum/t)
