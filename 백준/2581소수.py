start=int(input())
end=int(input())
thtn=[]
sum=0
for i in range(start,end+1):
    flag=False
    if i==1:
        flag=True
    else:
        for j in range(2,i):
            if i%j==0:
                flag=True
                break
            else:
                continue
    if flag==False:
        thtn.append(i)
for i in range(len(thtn)):
    sum+=thtn[i]
if len(thtn)==0:
    print(-1)
else:
    print(sum)
    print(thtn[0])
