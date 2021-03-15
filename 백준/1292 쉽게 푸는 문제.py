count=0
ans=0
a,b=map(int,input().split())
for i in range(50):
    if count>b:
            break
    for j in range(i):
        count+=1
        if count>=a and count<=b:
            ans+=i
print(ans)

