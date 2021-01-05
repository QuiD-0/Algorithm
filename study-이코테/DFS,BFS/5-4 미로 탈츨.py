'''
미로탈출
사용한 자료구조: BFS, 큐
시간 복잡도: O(N^2)
'''

from collections import deque as q
#입력 받기
n,m= map(int,input().split())
matrix=[]
for i in range(n):
    matrix.append([int(i) for i in input()])
#큐(초기값 0,0),방문확인배열(초기값 0,0),방향벡터
queue=q()
queue.append((0,0))
visit=[(0,0)]
dx,dy=[1,-1,0,0],[0,0,1,-1]
#방문 안한 모든 좌표에대해 확인
while(queue):
    #맨 앞의 좌표 pop
    x,y=queue.popleft()
    # 네방향 확인 // (1,0),(-1,0),(0,1),(0,-1)
    for i in range(4):
        nx,ny=x+dx[i],y+dy[i]
        #범위 밖이거나 벽일 경우
        if nx<0 or ny<0 or nx>=n or ny>=m or matrix[nx][ny]==0:
            continue
        #방문하지 않은경우 
        if (nx,ny) not in visit:
            visit.append((x,y))
            queue.append((nx,ny))
            matrix[nx][ny]=matrix[x][y]+1
        # 마지막 도달
        if (nx,ny)==(n-1,m-1):
            break
print(matrix[n-1][m-1])

