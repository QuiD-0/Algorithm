#문자열 뒤집기
s=[i for i in str(input())]
count=1
check=s[0]
for i,k in enumerate(s[0:]):
    if check==k:
        continue
    else:
        count+=1
        check=s[i]
print(count//2)