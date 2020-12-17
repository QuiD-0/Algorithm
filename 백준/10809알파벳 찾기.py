x=input()
li=list(x)
a=list()
atoz=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
for i in range(26):
    a.append(-1)
for i in range(len(li)):
    if a[atoz.index(str(li[i]))]==-1:
        a[atoz.index(str(li[i]))]=i
for i in range(26):
    print(a[i], end=' ')
