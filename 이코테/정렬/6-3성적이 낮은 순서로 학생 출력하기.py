'''
성적이 낮은 순서로 학생 출력하기
사용한 자료구조: 리스트
시간 복잡도: O(N log N)
'''

n=int(input())
ans=[]
for _ in range(n):
    ans.append([i for i in list(map(str,input().split()))])
ans.sort(key=lambda x:(x[1]))
print(' '.join([i for i,k in ans]))
