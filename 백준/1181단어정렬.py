# num = int(input())
# point=[]
# point = [input().split() for i in range(num)]
# result = sorted(point, key=lambda x: int(x[0]))
# for i in result:
#     print(i[0],i[1])

num = int(input())
words = [i for i in set([input() for i in range(num)])]
words.sort(key=lambda x: (len(x), x))
for i in words:
  print(i)
