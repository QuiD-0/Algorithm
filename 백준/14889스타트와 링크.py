import sys
N = int(input())
stat = [list(map(int, input().split())) for _ in range(N)]
player = [False for _ in range(N)]
minValue = 100000


def getAllCouple():
    global minValue
    sTeam = [idx for idx, val in enumerate(player) if val == True]
    lTeam = [idx for idx, val in enumerate(player) if val == False]
    s_ret = 0
    l_ret = 0
    for i in range(0, N//2):
        for j in range(i+1, N//2):
            s_first = sTeam[i]
            s_second = sTeam[j]
            s_ret += stat[s_first][s_second] + stat[s_second][s_first]

            l_first = lTeam[i]
            l_second = lTeam[j]
            l_ret += stat[l_first][l_second] + stat[l_second][l_first]

    minValue = min(minValue, abs(s_ret-l_ret))

def startAndLink(count, index):
    if count == N / 2 :
        print(player)
        getAllCouple()
        return
    for i in range(index, N):
        if not player[i]:
            player[i] = True
            startAndLink(count+1, i)
            player[i] = False

startAndLink(0, 1)
print(minValue)
