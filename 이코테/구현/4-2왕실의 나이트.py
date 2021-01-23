# 왕실의 나이트
# 사용한 자료구조: 리스트, 완전탐색
# 시간 복잡도: O(n)

pos=input()
col=int(pos[1])
row=ord(pos[0].lower())-96  #아스키 변환 후 a==1부터, 대문자일경우는 소문자로 변환후 계산  
moves=[[-1,-2],[-1,2],[1,-2],[1,2],[-2,-1],[-2,1],[2,-1],[2,1]] #이동 할수있는 방향
result=0
for a,b in moves:
    if 0<col+a and 9>col+a and 0<row+b and 9>row+b: #범위 체크
        result+=1
print(result)
