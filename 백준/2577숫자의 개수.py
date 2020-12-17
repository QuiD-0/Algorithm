r=1
for i in range(3):
    a=int(input())
    r*=a
ss=list(str(r))
ll = []
for i in range(10):
    ll.append(0)
for i in range(len(ss)):
    ll[int(ss[i])]+=1
for i in range(10):
    print(ll[i])
