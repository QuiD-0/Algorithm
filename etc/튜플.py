def solution(s):
    from collections import defaultdict
    a=defaultdict(int)
    new=list(s.replace("{","").replace("}",""))
    num=""
    for i in new:
        if i!=",":
            num+=i
        else:
            a[num]+=1
            num=""
    a[num]+=1
    ans=sorted(list(a.items()),key=lambda x:-x[1])
    
    return [int(i) for i,k in ans]