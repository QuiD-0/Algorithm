sick=int(input())
pill={}
for i in range(sick):
    a,b=map(int,input().split())
    pill[a]=b
for i in range(int(input())):
    a=[i for i in map(int,input().split())]
    ans=[]
    die=False
    for j in a[1:]:
        if j in pill.keys():
            ans.append(pill[j])
        else:
            die=True
    print(' '.join([str(i) for i in ans])) if not die else print('YOU DIED')