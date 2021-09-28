a= int(input())
index=1
ls=[]
temp=True
res=[]
while a:
    a-=1
    b=int(input())
    while index<=b:
        ls.append(index)
        res.append("+")
        index+=1
    if ls[-1]==b:
        ls.pop()
        res.append('-')
    else:
        temp=False
if temp:
    for i in res:
        print(i)
else:
    print("NO")
