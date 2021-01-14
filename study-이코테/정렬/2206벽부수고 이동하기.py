'''
벽 부수고 이동하기
사용한 자료구조: BFS, 큐
시간 복잡도: O(..?)
'''
from collections import deque as q

def bfs():
    queue = q([(0, 0, 1)])
    visit = [[[0] * 2 for i in range(m)] for i in range(n)]
    visit[0][0][1] = 1
    dx,dy=[1,-1,0,0],[0,0,1,-1]
    while queue:
        x, y, Count = queue.popleft()
        if x == n - 1 and y == m - 1:
            return visit[x][y][Count]
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if matrix[nx][ny] == 0 and visit[nx][ny][Count] == 0:
                    queue.append((nx, ny, Count))
                    visit[nx][ny][Count] = visit[x][y][Count] + 1
                if matrix[nx][ny] == 1 and Count == 1: 
                    queue.append((nx, ny, 0))
                    visit[nx][ny][0] = visit[x][y][1] + 1
    return -1

#입력 받기
n,m= map(int,input().split())
matrix=[]
for i in range(n):
    matrix.append([int(i) for i in input()])
print(bfs())