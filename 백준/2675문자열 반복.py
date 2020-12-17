a = int(input())
for i in range(a):
    re=''
    b = list(map(str, input().split()))
    b1 = int(b[0])
    c = list(map(str, b[1]))
    for j in range(len(c)):
        re+=c[j]*b1
    print(re)
