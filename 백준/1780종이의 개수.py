# def check(x,y,size):
#     s=set()
#     for i in range(size):
#         for j in range(size):
#             s.add(mat[i+x][j+y])
#     if len(s)==1:
#         ans[list(s)[0]]+=1
#     else:
#         for i in range(3):
#             for j in range(3):
#                 check(x+(i*size//3),y+(j*size//3),size//3)
#
# from collections import defaultdict
# global ans
# n=int(input())
# mat=[]
# ans=defaultdict(int)
# for i in range(n):
#     mat.append([i for i in map(int,input().split())])
# check(0, 0, n)
# for i in [-1,0,1]:
#     print(ans[i])
#

def check(x, y, size):
    if (size == 1):
        ans[board[x][y]] += 1
        return
    s = set()
    for i in range(size):
        for j in range(size):
            s.add(board[x + i][y + j])
    if len(s) == 1:
        ans[list(s)[0]] += 1
    else:
        for i in range(3):
            for j in range(3):
                check(x + (i * size // 3), y + (j * size // 3), size // 3)

n = int(input())
board = [list(map(int, input().split())) for _ in range(n)]
ans = {-1: 0, 0: 0, 1: 0}
check(0, 0, n)
for i in [-1, 0, 1]:
    print(ans[i])
