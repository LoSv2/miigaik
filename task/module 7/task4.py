count = int(input())
words = {}
for i in range(count):
    for word in input("").split():
        words[word] = words.get(word, 0) + 1
max = 0
mwords = []
for key, a in words.items():
    if a > max:
        max = a
        mwords = [key]
    elif a == max:
        mwords.append(key)
print(sorted(mwords)[0])