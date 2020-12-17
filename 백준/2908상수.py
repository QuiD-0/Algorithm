x=list(map(str,input().split()))
a=list(x[0])
b=list(x[1])
c=''
d=''
for i in range(len(a)):
    c+=a.pop()
for i in range(len(b)):
    d+=b.pop()
if int(c)>int(d):
    print(c)
else:
    print(d)
