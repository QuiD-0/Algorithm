#만들수 없는 금액
import itertools
a=int(input())
coin=list(map(int,input().split()))
sub=[]
for i in range(1, len(coin)+1):
    for subset in itertools.combinations(coin, i):
        sub.append(sum(subset))
count=1
while True:
    if count not in sub:
        print(count)
        break
    else:count+=1