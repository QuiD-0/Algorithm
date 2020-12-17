x=int(input())
li=[]
res=0
for i in range(x,0,-1):
    li=list(map(int,str(i)))
    a=sum(li)+i
    if a==x:
        res=i
print(res)   
