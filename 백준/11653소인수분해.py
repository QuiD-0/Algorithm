a=int(input())
i=2
if a==1:   
    print()
else:
    while i<=a:
        if (a%i==0):
            print(i)
            a=a/i
        else:
            i+=1
    
