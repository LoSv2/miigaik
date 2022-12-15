a = []
e = 1
m = 1
b = 1
while True:
    e = int(input())
    a.append(e)
    if e == 0:
        break
i = 1
while i < len(a):
    if a[i - 1] == a[i]:
        b += 1
        m = max(m, b)
    else:
        m = max(m, b)
        b = 1
    i += 1
print(m)