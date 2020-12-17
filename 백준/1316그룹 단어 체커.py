n = int(input())
count = 0
for i in range(n):
    sen = input()
    sen_lst = list(sen)
    sen_sort = sorted(sen, key=sen.find)
    if sen_lst == sen_sort:
        count += 1
print(count)
