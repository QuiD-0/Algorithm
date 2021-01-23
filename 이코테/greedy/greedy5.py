#모험가 길드

num=int(input())
fear=list(map(int,input().split()))
fear.sort(key=int)
count=0
guild=0
for i in fear:
    count+=1
    if count>=i:
        guild+=1
        count=0
print(guild)