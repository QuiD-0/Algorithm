from collections import deque

N = int(input())
queue = deque()
while True:
    data = int(input())
    if data == -1:
        break
    if data == 0:
        queue.popleft()
    elif len(queue) < N:
        queue.append(data)
print(' '.join(map(str, queue)) if queue else 'empty')