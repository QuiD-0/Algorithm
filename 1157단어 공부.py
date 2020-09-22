a = input().upper()
b = list(set(a))
c = []

for i in b:
    d = a.count(i)
    c.append(d)
if c.count(max(c)) >= 2:
    print("?")
else:
    print(b[(c.index(max(c)))].upper())    
