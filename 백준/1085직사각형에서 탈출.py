import heapq

pos = list(map(int, input().split()))

heap = []
heapq.heappush(heap, pos[0])
heapq.heappush(heap, pos[1])
heapq.heappush(heap, pos[2] - pos[0])
heapq.heappush(heap, pos[3] - pos[1])

print(heapq.heappop(heap))
