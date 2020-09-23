import sys
n = int(sys.stdin.readline())
count = [0]*10000
for i in range(n):
    num = int(sys.stdin.readline())
    count[num-1]+=1
    
for i in range(10000):
    while count[i]>0:
        sys.stdout.write("{}\n".format(i+1))
        count[i]-=1
