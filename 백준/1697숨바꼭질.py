from collections import deque

n, k = map(int, input().split())
dist = [0] * 100001

q = deque()
q.append(n)
while q:
    cur = q.popleft()
    if cur == k:
        print(dist[cur])
        break
    for i in [cur + 1, cur - 1, 2 * cur]:
        if 0 <= i <= 100000 and dist[i] == 0:
            q.append(i)
            dist[i] = dist[cur] + 1
