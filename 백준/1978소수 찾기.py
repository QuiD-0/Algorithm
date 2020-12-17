x=int(input())
a=list(map(int,input().split()))
count=0
for i in range(len(a)):
    flag=False
    if a[i]==1:
        continue
    else:
        for j in range(2,a[i]):
            if a[i]%j==0:
                flag=True
        if flag==False:
            count+=1
print(count)
