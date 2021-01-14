'''
스타트 링크
사용한 자료구조: BFS, 큐
시간 복잡도: O(N^2)
'''
from collections import deque as q

def bfs(top,now,target,up,down):
    dy=[up,-down]
    queue=q([(now,0)])
    visit={now}
    while queue:
        y,cnt=queue.popleft()
        if y==target:
            return cnt
        if y<=top and y>0:
            for i in dy:
                ny=y+i
                if ny not in visit and ny<=top and ny>=1:
                    visit.add(ny)
                    queue.append((ny,cnt+1))
    return "use the stairs" 
        
top,now,target,up,down=map(int,input().split())
print(bfs(top,now,target,up,down))
