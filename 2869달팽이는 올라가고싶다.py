import math
a,b,c=map(int,input().split())
x=math.ceil((c-a)/(a-b))+1
print(int(x))
