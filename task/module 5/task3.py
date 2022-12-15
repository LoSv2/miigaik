X = int(input())
Y = int(input())
i = 1
while X <= Y:
    X += X / 10
    i += 1
print(i)