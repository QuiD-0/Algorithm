def print_m(array):
    #확인용 함수
    for col in array:
        print(' '.join([str(i) for i in col]))

c,r=map(int,input().split())
mat=[[0]*c for _ in range(r)]
find=int(input())
if find>c*r or find<=0:
    print(0)
else:
    x=r-1
    y=0
    value=1
    dx=[[-1,0],[0,1],[1,0],[0,-1]]
    d=0
    while True:
        if c*r<value:
            break
        mat[x][y]=value
        value+=1
        x,y=x+dx[d][0],y+dx[d][1]
        if x<0 or x>=r or y<0 or y>=c or mat[x][y]!=0:
            x,y=x-dx[d][0],y-dx[d][1]
            d=(d+1)%4
            x,y=x+dx[d][0],y+dx[d][1]
    for i in range(r):
        for j in range(c):
            if mat[i][j]==find:
                print(j+1,r-i)
