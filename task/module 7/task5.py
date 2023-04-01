a = {"read": "R", "write": "W", "execute": "X"}
files=dict([input().split(maxsplit=1) for _ in range(int(input()))])
for i in range(int(input())):
    operation, filename = input().split()
    if a[operation] in files.get(filename, ""):
        print("OK")
    else:
        print("Denied")