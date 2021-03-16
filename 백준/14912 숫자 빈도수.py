x,find=map(str,input().split())
count=0
for i in range(1,int(x)+1):
    for j in str(i):
        if j==find:
            count+=1
print(count)