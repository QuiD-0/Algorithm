'''
경쟁적 전염
사용한 자료구조: BFS
시간 복잡도: O(N^2)
'''
from collections import deque as q
import sys

n,k=map(int,sys.stdin.readline().split())
matrix=[]
temp=[]
# 입력받고 정렬후 큐에 넣기
for i in range(n):
    matrix.append([i for i in list(map(int,sys.stdin.readline().split()))])
    for j in range(n):
        if matrix[i][j]!=0:
            temp.append([matrix[i][j],i,j,0])
s,x,y=map(int,input().split())
temp.sort(key=lambda x:x[0])
q=q(temp)
dx=[-1,1,0,0]
dy=[0,0,-1,1]

#전염 시작
while q:
    val,nx,ny,ns=q.popleft()
    #찾는 위치에 값이 들어온 경우 혹은 시간이 다된 경우
    if nx==x-1 and ny==y-1 or ns==s:
        break
    for i in range(4):
        ix=nx+dx[i]
        iy=ny+dy[i]
        # 범위 안에 있고 감엽시킬수있으면 큐에 저장
        if ix>=0 and ix<n and iy>=0 and iy<n:
            if matrix[ix][iy]==0:
                q.append([val,ix,iy,ns+1])
                matrix[ix][iy]=val
print(matrix[x-1][y-1])


'''
경쟁적 전염
사용한 자료구조: DFS -> 시간 초과
시간 복잡도: O(N^5)
'''

'''
import sys
def diffuse(x,y):
    global r,k
    if x<0 or x>=len(matrix) or y<0 or y>=len(matrix) or matrix[i][j]>k:
        return 0
    else:
        if matrix[x][y]==0:
            matrix[x][y]=r+k

def lower_bound():
    global n,k
    for i in range(n):
        for j in range(n):
            if matrix[i][j]>k:
                matrix[i][j]=matrix[i][j]-k

n,k=map(int,sys.stdin.readline().split())
matrix=[]
for _ in range(n):
    matrix.append([i for i in list(map(int,sys.stdin.readline().split()))])
s,x,y=map(int,input().split())
dx=[1,-1,0,0]
dy=[0,0,1,-1]
#s초 반복
for _ in range(s-1):
    #맵 탐색
    for i in range(n):
        for j in range(n):
            #1~k까지 순서대로 감염
            for r in range(1,k+1): 
                if matrix[i][j]==r:
                    for d in range(4):
                        i=i+dx[d]
                        j=j+dy[d]
                        diffuse(i,j)
        #맵 정리  ex) k가 3일때 4->1
        lower_bound()
print(matrix[x-1][y-1])
'''