a=int(input())
b=[ord(i)-96 for i in list(input())]
ls=[b[i]*31**i for i in range(a)]
print(sum(ls)% 1234567891)