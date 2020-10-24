a=int(input())
b=list(map(int,input().split()))
b.sort(key=int)
print(b[0]*b[a-1])
