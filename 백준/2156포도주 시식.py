# x=int(input())
# a=[]
# for i in range(x):
#     a.append(int(input()))
# dp=[0 for _ in range(x)]
# if x==1:
#     print(a[0])
# else:
#     dp[0]=a[0]
#     dp[1]=a[0]+a[1]
#     if x>2:
#         dp[2]=max(a[1]+a[2],a[0]+a[2],a[0]+a[1])
#         for i in range(3,x):
#             dp[i]=max(dp[i-1],dp[i-3]+a[i]+a[i-1],dp[i-2]+a[i])
#     print(dp[x-1])

n = int(input())
arr = list()
for i in range(n):
    arr.append(int(input()))
dp = [0] * n
dp[0] = arr[0]
if n==1:
    print(arr[0])
else:
    dp[1] = arr[0] + arr[1]
    if n>2:
        dp[2] = max(arr[0] + arr[2], arr[1] + arr[2], arr[0] + arr[1])
        for i in range(3, n):
            dp[i] = max(dp[i - 1], dp[i - 3] + arr[i] + arr[i - 1], dp[i - 2] + arr[i])
    print(dp[n - 1])

