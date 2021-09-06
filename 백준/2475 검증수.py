# 인풋
# 0 4 2 5 6
# 아웃풋
# 1

a=list(map(int,input().split()))
print(sum([i**2 for i in a])%10)