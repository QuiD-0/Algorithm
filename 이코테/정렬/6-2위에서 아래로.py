'''
위에서 아래로
사용한 자료구조: 리스트
시간 복잡도: O(N log N)
'''
n=int(input())
ans=[]
for i in range(n):
    ans.append(input())
ans.sort(key=int,reverse=True)
print(' '.join(ans))