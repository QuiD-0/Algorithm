import math  
x=int(input())
a=list(map(int,input().split()))
for i in a[1:]:
    val=math.gcd(a[0],i)
    print("{}/{}".format(a[0]//val,i//val))
