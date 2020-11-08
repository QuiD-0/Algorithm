from collections import deque
import sys
class queue:
    def __init__(self):
        self.queue=deque()
        self.idx=0
    def push(self,a):
        self.queue.append(a)
        self.idx+=1
    def pop(self):
        if self.idx ==0:
            print(-1)
        else:
            print(self.queue.popleft())
            self.idx-=1
    def size(self):
        print(self.idx)
    def empty(self):
        if self.idx==0:
            print(1)
        else:
            print(0)
    def front(self):
        if self.idx ==0:
            print(-1)
        else:
            print(self.queue[0])
    def back(self):
        if self.idx ==0:
            print(-1)
        else:
            print(self.queue[self.idx-1])

x=sys.stdin.readline().rstrip()
d=queue()
for _ in range(int(x)):
    command=sys.stdin.readline().rstrip().split()
    sc=command[0]
    if sc=="push":
        d.push(command[1])
    if sc=="pop":
        d.pop()
    if sc=="size":
        d.size()
    if sc=="empty":
        d.empty()
    if sc=="front":
        d.front()
    if sc=="back":
        d.back()
