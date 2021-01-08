'''
음료수 얼려 먹기
사용한 자료구조: DFS, 스택
시간 복잡도: O(N^2)
'''

# 4방향 탐색 0이면 1로 바꿔주고 1 반환 -> 한번 실행될때마다 주위를 모두 얼리고 1씩 증가 
def solv(x,y):
    if x<0 or x>=len(matrix) or y<0 or y>=len(matrix[0]) or matrix[x][y]==1 :
        return 0
    else:
        matrix[x][y]=1
        solv(x+1,y)
        solv(x,y+1)
        solv(x-1,y)
        solv(x,y-1)
        return 1

n,m= map(int,input().split())
matrix=[]
count=0
for i in range(n):
    matrix.append([int(i) for i in input()])
#모든 칸 확인
for i in range(n):
    for j in range(m):
        count+=solv(i,j)
print(count)
