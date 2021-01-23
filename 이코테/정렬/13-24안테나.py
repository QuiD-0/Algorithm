'''
안테나
사용한 자료구조: 리스트
시간 복잡도: O(N log N)
'''
n = int(input())
data = list(map(int,input().split()))
data.sort()
print(data[(n-1)//2])