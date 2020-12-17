# 재귀 깊이 제한 수정 
import sys
sys.setrecursionlimit(10**6)

x=int(input())
rgb=[]
for i in range(x):
    rgb.append(list(map(int,input().split())))

def paint_color(depth:int)->None:
    if depth==0:
        print(min(rgb[0][0],rgb[0][1],rgb[0][2]))
        return
    rgb[depth-1][0]=min(rgb[depth-1][0]+rgb[depth][1],rgb[depth-1][0]+rgb[depth][2])
    rgb[depth-1][1]=min(rgb[depth-1][1]+rgb[depth][0],rgb[depth-1][1]+rgb[depth][2])
    rgb[depth-1][2]=min(rgb[depth-1][2]+rgb[depth][0],rgb[depth-1][2]+rgb[depth][1])
    paint_color(depth-1)
paint_color(x-1)
