a = int(input())
nums = dict()
sort = list(map(int, input().split()))
sort2 = list(set(sort))
for i, k in enumerate(sorted(sort2, key=int)):
    nums[k] = i
res = []
for i in sort:
    res.append(str(nums[i]))
print(' '.join(res))
