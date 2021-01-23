'''
두 배열의 원소 교체
사용한 자료구조: 리스트
시간 복잡도: O(N log N)
'''
n,k=map(int,input().split())
arr1=[i for i in list(map(int,input().split()))]
arr2=[i for i in list(map(int,input().split()))]
arr1.sort()
arr2.sort(reverse=True)
print(arr1,arr2)
for i in range(k):
    if arr1[i]<arr2[i]:
        arr1[i],arr2[i]=arr2[i],arr1[i]
print(sum(arr1))