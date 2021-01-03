import sys
from collections import defaultdict

n = int(sys.stdin.readline())
k = int(sys.stdin.readline())
recommend = list(map(int, sys.stdin.readline().split()))

recommend_cnt = defaultdict(int)
candidate = []

for r in recommend:
    recommend_cnt[r] += 1
    if r in candidate:
        continue

    if len(candidate) < n:
        candidate.append(r)
        
    else:
        min_ = 1000
        t = 0
        for tmp in candidate:
            if recommend_cnt[tmp] < min_:
                min_ = recommend_cnt[tmp]
                t = tmp
        del(recommend_cnt[t])
        candidate.remove(t)
        candidate.append(r)


print(*sorted(candidate))
