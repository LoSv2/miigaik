a = [int(x) for x in input().split()]
count = len(a)
for i in range(0, count - 1, 2):
    print(a[i + 1], a[i], end=" ")
if count % 2 != 0:
    print(a[count - 1])