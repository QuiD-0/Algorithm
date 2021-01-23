# 후보 추천하기
# 사용한 자료구조: 딕셔너리
# 시간 복잡도: O(N^2)

import sys
from collections import defaultdict

n = int(sys.stdin.readline())
k = int(sys.stdin.readline())
recommend = list(map(int, sys.stdin.readline().split()))
# 추천받은 수
recommend_cnt = defaultdict(int)
# 추천받은 사람(액자)
candidate = []

#추천 받으면 액자에 등록
for r in recommend:
    recommend_cnt[r] += 1
    if r in candidate:
        continue

    if len(candidate) < n:
        candidate.append(r)
    # 추천수가 똑같을 경우 오래된 사람 탈락
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

#정렬 후 언패킹 
print(*sorted(candidate))
