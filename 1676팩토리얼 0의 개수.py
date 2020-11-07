fac=[1]*501
for i in range(2,501):
    fac[i]=fac[i-1]*i
x=int(input())
string=list(map(int,str(fac[x])))
string.reverse()
count=0
for word in string:
    if word==0:
        count+=1
    else:
        break
print(count)
