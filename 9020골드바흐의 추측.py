import math
thtn=[0]*10001
for i in range(10001):
    thtn[i]=i
#0이면 소수X
pp=int(len(thtn)**0.5)
thtn[0]=0
for i in range(2,pp+1):
    if thtn[i]!=0:
        for j in range(i+i,10001,i):
            thtn[j]=0
find=[]
for i in range(10000):
    if thtn[i]:
        find.append(thtn[i])
            
x=int(input())#총 반복
while x:
    x-=1
    a=int(input())
    s=a
    mini=0
    minj=0
    min=a
    while True:
        if thtn[s]==0:
            s-=1
        else:
            s=find.index(s)
            break
    for i in range(s):
        for j in range(s):
            if find[i]+find[j]==a:
                xxx=math.fabs(find[i]-find[j])
                if xxx<min:
                    min=xxx
                    mini=i
                    minj=j
    print(find[mini],find[minj])
