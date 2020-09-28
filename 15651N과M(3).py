x,m=map(int,input().split())
i=[]
def solv():
    if len(i)==m:
        print(' '.join(i))
        return
    for j in range(1,x+1):
        i.append(str(j))
        solv()
        i.pop()
solv()
        
            
            
        
