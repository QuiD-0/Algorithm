def solution(sizes):
    new_size=[]
    for l in sizes:
        new_size.append([i for i in sorted(l,key=int)])
    a=list(zip(*new_size))
    answer = max(a[0])*max(a[1])
    return answer