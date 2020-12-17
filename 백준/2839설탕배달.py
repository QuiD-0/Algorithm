x=int(input())
ahrt=int(x/5)
sum=-1
for i in range(ahrt,-1,-1):
    if int(x-(5*i))%3==0:
        a=(x-5*i)/3
        sum = i + a
        break
print(int(sum))
       
