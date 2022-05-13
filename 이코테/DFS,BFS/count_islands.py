from collections import deque


def bfs(x, y):
    q = deque()
    q.append([x, y])
    while q:
        a, b = q.popleft()
        for dx,dy in ([1,0],[-1,0],[0,1],[0,-1],[1,1],[1,-1],[-1,1],[-1,-1]):
            nx = a+dx
            ny = b+dy
            if nx>=0 and ny>=0 and nx<len(mat) and ny<len(mat[0]) and mat[nx][ny]==1:
                mat[nx][ny]=0
                q.append([nx,ny])

while True:
    n, m = map(int, input().split())
    if n == 0 and m == 0:
        break
    else:
        mat = []
        count = 0
        for i in range(m):
            mat.append(list(map(int, input().split())))
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                if (mat[i][j] == 1):
                    bfs(i, j)
                    count += 1
        print(count)
