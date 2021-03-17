def rounda(n):
    return int(n)+1 if n-int(n)>=0.5 else int(n)

n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
ratio = rounda(n*0.15)
a.sort()
if ratio != 0:
    a=[i for i in a[ratio:-ratio]]
print(rounda(sum(a)/len(a))) if len(a) != 0 else print(0)