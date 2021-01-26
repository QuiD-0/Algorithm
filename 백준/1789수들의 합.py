n=int(input())
i=1
while True:
    n-=i
    if n>=0:
        i+=1
    else:
        print(i-1)
        break
