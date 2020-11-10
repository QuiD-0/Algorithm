from collections import deque
import sys
class ddd():
    def __init__(self):
        self.q=deque()
        self.idx=0
    def push_back(self,a):
        self.q.append(a)
        self.idx+=1
    def push_front(self,a):
        self.q.appendleft(a)
        self.idx+=1
    def pop_front(self):
        if self.idx==0:
            print(-1)
        else:
            print(self.q.popleft())
            self.idx-=1
    def pop_back(self):
        if self.idx==0:
            print(-1)
        else:
            print(self.q.pop())
            self.idx-=1
    def size(self):
        print(self.idx)
    def empty(self):
        if self.idx!=0:
            print(0)
        else:
            (print(1))
    def front(self):
        if self.idx==0:
            print(-1)
        else:print(self.q[0])
    def back(self):
        if self.idx==0:
            print(-1)
        else:print(self.q[-1])
        
x=int(input())
s=ddd()
while(x):
    cmd=list(map(str,sys.stdin.readline().rstrip().split()))
    if cmd[0]=="push_back":
        s.push_back(int(cmd[1]))
    if cmd[0]=="push_front":
        s.push_front(int(cmd[1]))
    if cmd[0]=="pop_back":
        s.pop_back()
    if cmd[0]=="pop_front":
        s.pop_front()
    if cmd[0]=="size":
        s.size()
    if cmd[0]=="empty":
        s.empty()
    if cmd[0]=="front":
        s.front()
    if cmd[0]=="back":
        s.back()
    x-=1
