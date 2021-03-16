def print_m(array):
    #확인용 함수
    for col in array:
        print(' '.join([str(i) for i in col]))

a=input()
b=input()
d=[[0 for i in range(len(a)+1)] for j in range(len(b)+1)]
for i in range(1,len(b)+1):
    for j in range(1,len(a)+1):
        d[i][j]= d[i-1][j-1]+1 if a[j-1]==b[i-1] else max(d[i-1][j],d[i][j-1])
print_m(d)
print(d[-1][-1])