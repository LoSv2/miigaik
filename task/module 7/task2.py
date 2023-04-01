count = int(input())
s = dict([input().split() for _ in range(count)])
a = input()
for key, value in s.items():
    if a == key:
        print(value)
    elif a == value:
        print(key)
    else:
        continue