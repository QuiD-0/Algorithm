'''
괄호 변환
사용한 자료구조: 재귀
시간 복잡도: O(N)
'''
#올바른 괄호 문자열 확인 함수
def right(s):    
    count=0
    for k in s:
        if k=="(":
            count+=1
        else:
            count-=1
#중간에 ')' 가 '(' 보다 많아질 경우
        if count<0:    
            return False
#')' 와 '(' 의 갯수가 다를경우
    if count!=0:    
        return False
    return True

#문자열 나누는 함수
def div_uv(s):   
    if s=="":
        return ""
    count=0
#첫 올바른 괄호 문자열에서 u, v 분리
    for idx,k in enumerate(s,1):  
        if k=="(":
            count+=1
        if k==")":
            count-=1
        if count==0:   
            u=s[:idx]
            v=s[idx:]
            break
#u가 올바를 경우 v에 대해 재귀수행
    if right(u):   
        return u+div_uv(v)
#u가 올바르지 않을경우
    else:   
        ans="("+div_uv(v)+")"
#u의 처음, 마지막 괄호 빼고 뒤집어 주기
        for i in u[1:-1]:   
            if i=="(":
                ans+=")"
            else:
                ans+="("
        return ans
    return u+v

def solution(p):
    return div_uv(p)