'''
국영수
사용한 자료구조: 리스트
시간 복잡도: O(N log N)
'''
n=int(input())
ans=[]
for _ in range(n):
    ans.append([i for i in list(map(str,input().split()))])
ans.sort(key=lambda x:(-int(x[1]),int(x[2]),-int(x[3]),x[0]))
for i in range(n):
    print(ans[i][0])