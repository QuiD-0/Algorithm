# 마인크래프트
# 사용한 자료구조: 완전 탐색
# 시간 복잡도: O(N^2)

import sys
n, m, b = map(int, sys.stdin.readline().split())
table_2d = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
table=[]
for i in table_2d:
    for j in i:
        table.append(j)
height = 0
ans = sys.maxsize
# 0부터 256까지 모두 계산
for i in range(257):
    max = 0
    min = 0
    for j in range(n*m):
        if table[j]< i:
            min += (i - table[j])
        else:
            max += (table[j] - i)
    # 인벤= 깍은 블럭수 + 초기 블럭수 
    inventory = max + b
    #설치할수있는 블럭수가 설치해야할 블록보다 더 적은경우 
    if inventory < min:
        continue
    time = 2 * max + min
    # 최소 시간, 높이 찾기
    if time <= ans:
        ans = time
        height = i
print(ans, height)