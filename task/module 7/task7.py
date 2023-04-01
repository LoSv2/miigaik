count = int(input())
words = {}
for i in range(count):
    for word in input("").split():
        words[word] = words.get(word, 0) + 1
for key in sorted(words, key=words.get, reverse=True):
    print(key, words[key])