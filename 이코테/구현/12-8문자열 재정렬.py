# 문자열 재정렬
# 사용한 자료구조: 리스트
# 시간 복잡도: O(N Log N)

s=list(map(str,input()))
s.sort()
sum=0
ans=[]
for i in s:
    if ord(i)<58: # 숫자일 경우 
        sum+=int(i)
    else: # 문자일경우
        ans.append(i)
ans.append(str(sum)) #마지막에 리스트에 저장
print(''.join(ans))