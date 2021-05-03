num= input()
l=len(num)
ans=0
for i in range(1,l+1):
    ans=ans+int(num)
    num=int(num)-pow(10,i-1)*9
print(ans)