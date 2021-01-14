'''
카드 정렬하기
사용한 자료구조: 리스트
시간 복잡도: O(N log N)
'''

import heapq
n=int(input())
cards=[]
for _ in range(n):
    heapq.heappush(cards,int(input()))
if n==1:
    print(0)
else:
    ans=0
    while len(cards)>1:
        num1=heapq.heappop(cards)
        num2=heapq.heappop(cards)
        ans+=num1+num2
        heapq.heappush(cards,ans)
    print(ans)
