#곱하기 혹은 더하기
num=str(int(input()))
result=int(num[0])
for i in num[1:]:
    if i=="0" or i=="1":
        result+=int(i)
        print(i)
    else:
        result*=int(i)
        print(i)
print(result)
