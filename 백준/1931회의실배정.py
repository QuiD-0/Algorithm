x=int(input())
a=[]
for i in range(x):
    a.append(list(map(int,input().split())))
a.sort(key=lambda x:(x[1],x[0]))
max_meeting = 0
start = 0
for meet in a:
    if meet[0] >= start:
        start = meet[1]
        max_meeting += 1
print(max_meeting)

