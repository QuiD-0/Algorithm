#숫자 카드 게임

n,m=map(int,input().split())
matrix=[]
for i in range(n):
    matrix.append(min(list(map(int,input().split()))))
print(max(matrix))
