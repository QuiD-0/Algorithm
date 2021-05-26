import heapq,sys
n=int(sys.stdin.readline())
num=[]
for _ in range(n):
    a=int(sys.stdin.readline())
    if a==0 and len(num)!=0:
        print(heapq.heappop(num))
    elif a==0 and len(num)==0:
        print(0)
    else:
        heapq.heappush(num, a)
