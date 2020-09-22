x=int(input())
a=[input() for _ in range(x)]
a=sorted(a,key=int)
print('\n'.join(a))
