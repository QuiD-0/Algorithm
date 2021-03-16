x=int(input())
for _ in range(x):
    print(sorted([i for i in list(map(int,input().split()))],reverse=True)[2])