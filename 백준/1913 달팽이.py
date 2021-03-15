def print_m(array):
    for col in array:
        print(' '.join([str(i) for i in col]))

n=int(input())
x=int(input())
snail=[[0]*n for _ in range(n)]
move = [[0,1],[1,0],[0,-1],[-1,0]] 
d = 0 
now_x = 0  
now_y = 0  
now_num = n*n 
while(now_num > 0): 
    snail[now_y][now_x] = now_num 
    if(now_x + move[d][0] < 0 or now_x + move[d][0] >= n or now_y + move[d][1] < 0 or now_y + move[d][1] >= n or snail[now_y+move[d][1]][now_x+move[d][0]] != 0): 
        d = (d + 1) % 4 
    now_y = now_y + move[d][1] 
    now_x = now_x + move[d][0] 
    now_num = now_num - 1
print_m(snail)
for i in range(n):
    for j in range(n):
        if snail[i][j]==x:
            print(i+1,j+1)
