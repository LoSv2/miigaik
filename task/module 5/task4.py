a = []
b = 1
count = 0
while True:
    c = int(input())
    b = c
    a.append(c)
    if b == 0:
        break
i = 0
while i < len(a) - 1:
    if a[i] < a[i + 1]:
        count += 1
    i += 1
print(count)