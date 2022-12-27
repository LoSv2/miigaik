a = input()
b = len(a)
print(a[b // 2 + b % 2 :], a[: b // 2 + b % 2], sep="")