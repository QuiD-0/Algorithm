def check(a):
    if a==0:
        return False
    if dock[a]:
        return check(a-1)
    else:
        dock[a]=1
        return True

g=int(input())
p=int(input())
dock=[0]*(g+1)
plane=[]
for _ in range(p):
    plane.append(int(input()))
for i in plane:
    if not check(i):
        break
print(sum(dock))
    
