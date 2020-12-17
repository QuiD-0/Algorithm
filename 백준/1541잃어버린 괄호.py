x=input()
a=x.split("-")
b=[]
for i in range(len(a)):
    b.append(list(map(int,a[i].split("+"))))
    b[i]=sum(b[i])
ans=b[0]
for i in range(1,len(b)):
    ans-=b[i]
print(ans)
    
