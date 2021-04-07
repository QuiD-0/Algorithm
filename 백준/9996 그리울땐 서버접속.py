n=int(input())
pattern = input().split('*')
words=[]
for _ in range(n):
    words.append(input())
for word in words:
    flag=False
    if pattern[0] == word[:len(pattern[0])]:
        a=word.replace(pattern[0],'')
        if pattern[1] == a[-len(pattern[1]):]:
            flag=True
    print('DA') if flag else print('NE')