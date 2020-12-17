x=int(input())
count=0
ans=0
while True:
    str_count=str(count)
    if str_count.find('666')>=0:
        ans+=1
        if x==ans:
            print(count)
            break
    count+=1
