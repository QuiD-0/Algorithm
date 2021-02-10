'''
네트워크 / 프로그래머스
사용한 자료구조: BFS,완전탐색
시간 복잡도: O(N log N ?)
'''

from collections import defaultdict as d
from collections import deque

def solution(n, computers):
    #그래프 노드 생성  EX) graph={1 : [1,2], 2 : [1,2], 3 : [3]}
    graph=d(list)  
    for i in range(n):
        for idx,j in enumerate(computers[i],1):
            if j==1:
                graph[i+1].append(idx)
    visit=[]
    count=0
    #1번 노드부터 탐색
    for i in range(1,n+1):  
        q=deque()
        q.extend(graph[i])
        flag=False
        #연결된 모든 노드를 visit에 저장
        while q:   
            node=q.popleft()
            #노드가 visit에 없을 경우 새로운 네트워크 
            if node not in visit:
                #해당 노드에 저장된 모든 노드들을 visit에 저장  
                visit.append(node)    
                q.extend(graph[node])   
                flag=True
        #새 네트워크를 찾았을 경우 1증가
        if flag:  
            count+=1 
    return count