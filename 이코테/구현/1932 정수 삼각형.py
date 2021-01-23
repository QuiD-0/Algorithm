# 정수 삼각형
# 사용한 자료구조: 리스트,DP
# 시간 복잡도: O(N log N)

x=int(input())
tri=[]
# Data 입력
for i in range(x):
    tri.append(list(map(int,input().split())))
#다이나믹 프로그래밍 사용
def dp(depth:int)->list:
    global tri
    if(depth==0):
        print(tri[0][0])
        return
    #bottom up 방식으로 적용
    for i in range(depth):
        tri[depth-1][i]=max(tri[depth-1][i]+tri[depth][i],tri[depth-1][i]+tri[depth][i+1])
    dp(depth-1)
dp(x-1)
    
