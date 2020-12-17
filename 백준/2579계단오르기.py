x=int(input())
stair=[]
dp=[0 for _ in range(x)]
for i in range(x):
    stair.append(int(input()))

if x==1:
    print(stair[0])
elif x==2:
    print(stair[0]+stair[1])
else:
    dp[0]=stair[0]
    dp[1]=stair[0]+stair[1]
    dp[2]=max(stair[0]+stair[2],stair[1]+stair[2])
    for i in range(3,x):
        dp[i]=max(stair[i]+dp[i-2],stair[i]+dp[i-3]+stair[i-1])
    print(dp[x-1])
