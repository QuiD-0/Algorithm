import sys
class Stack:
    def __init__(self):
        self.stack=[]
        self.idx=0
    def push(self,a):
        self.stack.append(a)
        self.idx+=1
    def pop(self):
        self.idx-=1
        if self.idx==-1:
            print(self.idx)
            self.idx=0
        else:print(self.stack.pop())
    def size(self):
        print(self.idx)
    def empty(self):
        if self.idx==0:
            print(1)
        else:
            print(0)
    def top(self):
        if self.idx==0:
            print(-1)
        else:print(self.stack[self.idx-1])
        
num = int(sys.stdin.readline().rstrip())
stack = Stack()

for i in range(num):
    command = sys.stdin.readline().strip().split()

    sc = command[0]
    print(command)
    if sc == 'push':
        stack.push(command[1])
    elif sc == 'pop':
        stack.pop()
    elif sc == 'size':
        stack.size()
    elif sc == 'empty':
        stack.empty()
    elif sc == 'top':
        stack.top()
