from collections import deque 
import sys
a=int(sys.stdin.readline().rstrip())
q=deque()
while a:
    a-=1
    cmd=sys.stdin.readline().rstrip()
    if(cmd.startswith("push")):
        num=cmd.split(' ')[1]
        q.append(num)
    if(cmd=="pop"):
        if len(q)==0:
            print(-1)
        else:
            print(q.popleft())
    if(cmd=='size'):
        print(len(q))
    if(cmd=="empty"):
        print(1 if len(q)==0 else 0)
    if (cmd=="front"):
        print(q[0] if len(q)!=0 else -1)
    if (cmd=="back"):
        print(q[-1] if len(q)!=0 else -1)