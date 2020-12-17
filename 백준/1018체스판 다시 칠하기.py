N, M = map(int, input().split())
map_list = [list(input()) for _ in range(N)]
min_num = N*M
color=['B','W','B']
for i in range(N - 7):
    for j in range(M - 7):
        for p in range(2):
            num1= 0
            for k in range(i, i + 8):
                for l in range(j, j + 8):
                    if ((k + l) % 2 == 0):
                        if (map_list[k][l] == color[p]):
                            num1 += 1
                    else:
                        if (map_list[k][l] == color[p+1]):
                            num1 += 1
            min_num=min(num1,min_num)
print(min_num)
