money=int(input())
result=0
items=[500,100,50,10]
for i in items:
    coin,money=divmod(money,i)
    result+=coin
print(result)
