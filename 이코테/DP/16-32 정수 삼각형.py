x=int(input())
tri=[]
for i in range(x):
    tri.append(list(map(int,input().split())))
def dp(depth:int)->list:
    global tri
    if(depth==0):
        print(tri[0][0])
        return
    for i in range(depth):
        tri[depth-1][i]+=max(tri[depth][i],tri[depth][i+1])
    dp(depth-1)
dp(x-1)
print(tri)
    