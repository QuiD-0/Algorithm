a,b=map(int,input().split())
q=[]
for i in range(b):
    q.append([i for i in list(map(str,input().split()))])
q.sort(key=lambda x:(int(x[1]),int(x[0])))
ans=''
for i in q:
    ans+=str(i[-1])
print(ans)