count = 0
N = int(input()) 
x = [0 for _ in range(N+1)]

def isPromising(depth, i):
    for row in range(1, depth): 
        if i == x[row] or abs(i - x[row]) == abs(depth - row):
            return False 
    return True 
def nQueens(depth): 
    global count 
    for i in range(1, N + 1): 
        if isPromising(depth, i) == True: 
            x[depth] = i 
            if depth == N:
                count += 1
            nQueens(depth+1)
                
nQueens(1) 
print(count)
