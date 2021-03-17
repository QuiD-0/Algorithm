n,m=map(int,input().split())
dogam={}
for i in range(1,n+1):
    po=input()
    dogam[po]=str(i)
    dogam[str(i)]=po
for i in range(m):
    a=input()
    print(dogam[a])