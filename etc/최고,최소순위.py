def solution(lottos, win_nums):
    count=0
    for i in lottos:
        if i in win_nums:
            count+=1
    tabel = {6:1,5:2,4:3,3:4,2:5,1:6,0:6}
    answer = [tabel[count+lottos.count(0)],tabel[count]]
    return answer