import math
def counter(n,m):
    count=0
    while n !=0:
        n=n//m
        count+=n
    return count
x,y=map(int,input().split())
print(min(counter(x,5)-counter(y,5)-counter(x-y,5),counter(x,2)-counter(y,2)-counter(x-y,2)))
