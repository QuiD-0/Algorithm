t=int(input())
for i in range(t):
    li=list(map(int,input().split()))
    avg=0
    for j in range(1,len(li)):
        avg+=li[j]
    avg=avg/li[0]
    count=0
    for j in range(1,len(li)):
        if li[j]>avg:
            count+=1
    print('{0:.3f}'.format(count/li[0]*100)+"%")
