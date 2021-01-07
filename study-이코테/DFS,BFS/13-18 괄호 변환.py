'''
괄호 변환
사용한 자료구조: 재귀
시간 복잡도: O(N)
'''

def right(s):    #올바른 괄호 문자열 확인 함수
    count=0
    for k in s:
        if k=="(":
            count+=1
        else:
            count-=1
        if count<0:    #중간에 ')' 가 '(' 보다 많아질 경우
            return False
    if count!=0:    #')' 와 '(' 의 갯수가 다를경우
        return False
    return True

def div_uv(s):   #문자열 나누는 함수
    if s=="":
        return ""
    count=0
    for idx,k in enumerate(s,1):  #첫 올바른 괄호 문자열에서 u, v 분리
        if k=="(":
            count+=1
        if k==")":
            count-=1
        if count==0:   
            u=s[:idx]
            v=s[idx:]
            break
    if right(u):   #u가 올바를 경우 v에 대해 재귀수행
        return u+div_uv(v)
    else:   #u가 올바르지 않을경우
        ans="("+div_uv(v)+")"
        for i in u[1:-1]:   #u의 처음, 마지막 괄호 빼고 뒤집어 주기
            if i=="(":
                ans+=")"
            else:
                ans+="("
        return ans
    return u+v

def solution(p):
    return div_uv(p)