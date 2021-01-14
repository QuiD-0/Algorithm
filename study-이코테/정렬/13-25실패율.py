'''
실패율
사용한 자료구조: 리스트
시간 복잡도: O(N log N)
'''

def solution(N, stages):
    p=len(stages)
    arr=[]
    for i in range(N):
        count=stages.count(i+1)
        if p==0:
            arr.append(0)
        else:
            arr.append(count/p)
            p-=count
    answer = []
    for i in range(N):
        b=arr.index(max(arr))
        arr[b]=-1
        answer.append(b+1)
    return answer