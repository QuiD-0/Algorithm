document=input()
word=input()
if word==document:
    print(1)
else:
    a=document.split(word)
    print(len(a)-1)
