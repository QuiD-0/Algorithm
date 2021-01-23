'''
특정 거리의 도시 찾기
사용한 자료구조: BFS, 딕셔너리, 덱
시간 복잡도: O(N^2...?)
'''
from collections import defaultdict
from collections import deque
import sys
#입력받기
n,m,k,x=map(int,sys.stdin.readline().split())
graph=defaultdict(list)
q=deque()
q.append(x)
visit=[]
dis=defaultdict()
#그래프 생성
for i in range(m):
    a,b=map(int,sys.stdin.readline().split())
    graph[a].append(b)

#root거리
dis[x]=0
while q:
    node=q.popleft()
    #모든 다음 노드거리 체크
    for next in graph[node]:
        if dis[node]>k:
            continue
        if next not in visit:
            visit.append(next)
            dis[next]=dis[node]+1
            q.extend(graph[node])
#찾는 거리인 노드 출력
for i in dis.keys():
    if dis[i]==k:
        print(i)
#찾는 거리가 없을때
if k not in dis.values():
    print(-1)