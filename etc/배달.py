from collections import defaultdict
import heapq
def solution(N, road, K):
    dis=[1000000]*N
    graph=defaultdict(list)
    q=[]
    for a,b,cost in road:
        graph[a].append([b,cost])
        graph[b].append([a,cost])
    heapq.heappush(q,(0,1))
    while q:
        cost,node=heapq.heappop(q)
        if cost > K+1:
            break
        if dis[node-1]<=K:
            continue
        if dis[node-1]>cost:
            dis[node-1]=cost
        for next_node,next_cost in graph[node]:
            heapq.heappush(q,(cost+next_cost,next_node))
    answer = 0
    for i in dis:
        if i <=K:
            answer+=1
    return answer