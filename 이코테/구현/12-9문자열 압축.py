# 문자열 압축
# 사용한 자료구조: 리스트
# 시간 복잡도: O(N^2)

def solution(s):
    if len(s)==1: #문자열의 길이가 1일때 
        return 1
    temp="" #압축후 문자열저장용 
    length=[] #압축후의 길이 배열
    for i in range(1,len(s)//2+1): #문자열의 길이가 1~절반까지 반복
        di=s[:i] 
        count=1
        for j in range(i,len(s)+1,i): #i개의 길이로 쪼개기
            if s[j:j+i]==di: #쪼갠 문자가 앞의 문자와 같을때
                count+=1
            else: #다를때 문자열 이어 붙이기
                if count==1:
                    count=""
                temp+=str(count)+di
                di=s[j:j+i]
                count=1
        if count == 1: #마지막 남은 단어 붙이기
            count = ""
        temp += str(count) + di
        length.append(len(temp))
        temp = ""
    return min(length)