a = input().split()
collection = {}
for i in a:
    b = collection.get(i, 0)
    print(b, end=" ")
    collection[i] = b + 1