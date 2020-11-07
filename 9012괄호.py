x=int(input())
a=[]
for i in range(x):
    b=list(map(str,input()))
    if len(b)%2==0:
        count=0
        for j in range(len(b)):
            if b[j]=="(":
                count+=1
            else:
                count-=1
            if count<0:
                break
        if count==0:
            print("YES")
        else:
            print("NO")
    else:
        print("NO")
        
