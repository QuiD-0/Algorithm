n, k = map(int, input().split())
a = []
for _ in range(n):
    a.append(int(input()))
start, end = 1, max(a)

# while start <= end:
#     mid = (start + end) // 2
#     lines = 0
#     for i in a:
#         lines += i // mid
#     if lines >= k:
#         start = mid +1
#     else:
#         end = mid -1
# print(end)
#

while start <= end:
    mid = (start + end) // 2
    lines = 0
    for i in a:
        lines += i // mid
    if lines >= k:
        start = mid + 1
    else:
        end = mid - 1
print(end)
