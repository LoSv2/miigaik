a = int(input())
f = [1, 1]
i = 0
while True:
    i += 1
    f.append(f[i - 1] + f[i])
    if a == f[i]:
        print(i+1)
        break
    elif a < f[i]:
        print(-1)
        break