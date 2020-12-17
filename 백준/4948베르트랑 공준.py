thtn=[0]*(123456*2+1) #0이면 소수
pp=int(len(thtn)**0.5)
thtn[0]=1
for i in range(2,pp+1):
    if thtn[i]==0:
        for j in range(i+i,123456*2,i):
            thtn[j]=1
x=int(input())
while x:
    if x==1:
        print(1)
    else:
        count=thtn[x+1:2*x].count(0)
        print(count)
    x=int(input())
