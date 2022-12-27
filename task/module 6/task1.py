a = [int(a) for a in input().split()]
f = []
for i in range(len(a)):
    if int(a[i]) % 2 != 0:
        f.append(a[i])
print(f)