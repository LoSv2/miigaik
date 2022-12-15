f = 1
f1 = 1
n = input()
n = int(n)
i = 0
while i < n - 2:
    a = f + f1
    f = f1
    f1 = a
    i = i + 1
print(f1)