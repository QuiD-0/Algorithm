class key():
    def __init__(self):
        self.pw=[]
        self.index=0
    
    def Lshift(self):
        if self.index>1:
            self.index-=1
        else:
            pass
    def Rshift(self):
        if len(self.pw)==self.index:
            pass
        else:
            self.index+=1

    def delete(self):
        if self.index==0:
            pass
        else:
            self.pw.pop(self.index-1)
            self.index-=1

    def insert(self,data):
        self.pw.insert(self.index,data)
        self.index+=1

    def __str__(self):
        return ''.join(self.pw)

t=int(input())
for _ in range(t):
    word=input()
    log=key()
    for i in word:
        if i=='<':
            log.Lshift()
        elif i=='>':
            log.Rshift()
        elif i=='-':
            log.delete()
        else:
            log.insert(i)
    print(log)