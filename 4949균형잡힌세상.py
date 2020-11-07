a=str(input())
while(a!="."):
    b=[]
    flag=True
    for i in a:
        if i=="[":
            b.append(i)
        if i=="(":
            b.append(i)
        if i==")":
            if len(b)>0:
                if b.pop()!="(":
                    flag=False
            else:
                flag=False
        if i=="]":
            if len(b)>0:
                if b.pop()!="[":
                    flag=False
            else:
                flag=False
    if flag==True and len(b)==0:
        print("yes")
    else:print("no")
    a=str(input())
