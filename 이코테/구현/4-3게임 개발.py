# 게임 개발
# 사용한 자료구조: 딕셔너리, 완전 탐색
# 시간 복잡도: O(N)?..

col,row=map(int,(input().split()))
x,y,bearing=map(int,(input().split()))
matrix=[]
for _ in range(col):#지도 입력
    matrix.append(list(map(int,input().split())))
visit=[[0]*row for _ in range(col)] #방문 배열
visit[x][y]=1 #처음 위치 방문처리
b_to_d={0:[-1,0],1:[0,1],2:[1,0],3:[0,-1]} #방위별 가야 할 방향
count=1
turn=0 ## 회전한 횟수
while True:
    bearing-=1  #반시계 방향 회전
    if bearing==-1:
        bearing=3
    #방위에 해당하는 방향으로 갔을경우 visit가 0 이고 육지일경우
    if visit[b_to_d[bearing][0]+x][b_to_d[bearing][1]+y]==0 and matrix[b_to_d[bearing][0]+x][b_to_d[bearing][1]+y]==0:
        x+=b_to_d[bearing][0]
        y+=b_to_d[bearing][1]
        visit[x][y]=1
        count+=1
        turn=0
    else:  #가본 방향일경우 or 바다일경우
        turn+=1
    if turn==4: # 4번 돌아봤을 경우
        if matrix[x-b_to_d[bearing][0]][y-b_to_d[bearing][1]]==0:
            x-=b_to_d[bearing][0]
            y-=b_to_d[bearing][1]
            turn=0 # 돌아본 횟수 초기화
        else:
            print(count) # 탐색 종료
            break



