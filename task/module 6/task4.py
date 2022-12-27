a: list[int] = [int(x) for x in input().split()]
min= a.index(min(a))
max = a.index(max(a))
a[min], a[max] = (a[max], a[min],)
print(" ".join(map(str, a)))