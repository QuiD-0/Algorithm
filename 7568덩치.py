x=int(input())
weight=[]
height=[]
count=[0]*x
result=[]
for _ in range(x):
    w,h=map(int,input().split())
    weight.append(w)
    height.append(h)
for i in range(x):
    for j in range(x):
        if weight[i]<weight[j] and height[i]<height[j]:
            count[i]+=1
for i in range(x):
    result.append(str(count[i]+1))
print(' '.join(result)) 
