n,m=map(int,input().split())
hash={}
for _ in range(n):
    key,value=map(str,input().split())
    hash[key]=value
for _ in range(m):
    find=input()
    print(hash[find])