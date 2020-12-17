x=int(input())
a=[]
for i in range(x):
    b=int(input())
    if b!=0:
        a.append(b)
    if b==0:
        a.pop()
print(sum(a))
        
