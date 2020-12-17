num = int(input())
point=[]
point = [input().split() for i in range(num)]
result = sorted(point, key=lambda x: int(x[0]))
for i in result:
    print(i[0],i[1])
