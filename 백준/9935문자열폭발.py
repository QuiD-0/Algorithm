string = input()
pattern = input()
stack = []
for i in string:
    stack.append(i)
    if len(stack) >= len(pattern):
        if ''.join(stack[-len(pattern):]) == pattern:
            del stack[-len(pattern):]
if stack:
    print(''.join(stack))
else:
    print("FRULA")