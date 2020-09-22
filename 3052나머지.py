ll=[]
find=[]
for i in range(10):
    ll.append(int(input())%42)
    try:
        find.index(ll[i])
    except ValueError:
        find.append(ll[i])
print(len(find))
    
