
# 소수인지 최적화하여 판별하기
def check(n):
    if n == 1:
        return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True
    

n=input()
ints = list(map(int, input().split()))
count = 0
for i in ints:
    if check(i):
        count+=1

print(count)
