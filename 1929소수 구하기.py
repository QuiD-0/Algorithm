start,end=map(int,input().split())
for i in range(start,end+1):
    pp=int(i**0.5)
    flag=False
    if i==1:
        flag=True
    else:
        for j in range(2,pp+1):
            if i%j==0:
                flag=True
                break
            else:
                continue
    if flag==False:
        print(i)
