'''
감시 피하기
사용한 자료구조: DFS, 백트래킹
시간 복잡도: O(N^2)
'''

# 선생의 입장에서 학생 찾기 -> 찾으면 True
def find(x,y,s):
#벽이거나 오브젝트일때 탐색종료
    if x<0 or x>=len(matrix) or y<0 or y>=len(matrix) or matrix[x][y]=="O":  
        return False
    #학생을 찾았을경우 True 리턴
    if matrix[x][y]=="S":  
        return True
    # 한 방향으로만 참색
    if s=='u':  
        return find(x-1,y,"u")
    if s=='d':
        return find(x+1,y,"d")
    if s=='l':
        return find(x,y-1,"l")
    if s=='r':
        return find(x,y+1,"r")
    
def dfs(count):
    #벽 3개 생성한 경우 
    if count==3:  
        flag=False
        # 맵탐색 후 선생일 경우 학생 찾기 // 4방향
        for i in range(n):  
            for j in range(n):
                if matrix[i][j]=='T' and flag==False:
                    if find(i,j,"u") or find(i,j,"d") or find(i,j,"l") or find(i,j,"r"):
                        flag=True
        # 찾으면 True,못찾으면 False
        ans.add(flag)  
    #벽 세우기
    else: 
        for i in range(n):
            for j in range(n):
                if matrix[i][j]=='X':
                    matrix[i][j]='O'
                    dfs(count+1)
                    matrix[i][j]='X'
        
n=int(input())
matrix=[]
ans=set()
for _ in range(n):
    matrix.append([i for i in list(map(str,input().split()))])
dfs(0)
# 한번이라도 학생을 못찾은 경우 -> 오브젝트가 모든 학생을 가림
if False in ans:  
    print("YES")
else:
    print("NO")