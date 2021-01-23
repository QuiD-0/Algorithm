'''
단어 변환
사용한 자료구조: BFS
시간 복잡도: O(N^3)
'''

from collections import deque,defaultdict
# 한개의 알파벳만 다른지 확인
def check(a,b):
    if a==b:return False
    count=0
    for i,k in zip(a,b):
        if i!=k:
            count+=1
    return True if count==1 else False
    
def solution(begin, target, words):
    graph=defaultdict(list)
    visit=[]
    q=deque()
    q.append([begin,0])
    # 시작 단어와 알파벳차이가 하나인 단어 그래프에 추가
    for i in words:
        if check(begin,i):
            graph[begin].append(i)
    # 모든 단어에 대해 하나차이나는 단어 그래프 추가
    for i in words:
        for j in words:
            if check(i,j):
                graph[i].append(j)
    # 탐색 q->{(hit,0),(hot,1),(hip,1)}
    while q:
        node,count=q.popleft()
        if node==target:
            return count
        if node not in visit:
            visit.append(node)
            q.extend(zip(graph[node],[count+1]*len(graph[node])))
    return 0