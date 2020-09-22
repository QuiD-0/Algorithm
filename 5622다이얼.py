x=input()
x=list(x)
count=0
for i in range(len(x)):
    if x[i]=='A' or x[i]=='B' or x[i]=='C':
        count+=3
    elif x[i]=='D' or x[i]=='E' or x[i]=='F':
        count+=4
    elif x[i]=='G' or x[i]=='H' or x[i]=='I':
        count+=5
    elif x[i]=='J' or x[i]=='K' or x[i]=='L':
        count+=6
    elif x[i]=='M' or x[i]=='N' or x[i]=='O':
        count+=7
    elif x[i]=='P' or x[i]=='Q' or x[i]=='R' or x[i]=='S':
        count+=8
    elif x[i]=='T' or x[i]=='U' or x[i]=='V':
        count+=9
    elif x[i]=='W' or x[i]=='X' or x[i]=='Y'or x[i]=='Z':
        count+=10
print(count)
