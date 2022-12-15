N = int(input())
a = ''
i = 1
while i ** 2 <= N:
    a += str(i ** 2) + ' '
    i += 1
print(a)