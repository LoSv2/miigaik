import re
sp = []
def read_file():
    f=open("data.txt", encoding="utf-8")
    a=f.readlines()
    global sp
    for line in a:
        line = re.sub('[!|@|#|$|%|^|&|*|?|>|<|.| |(|)|"|,|+|=|_|—|«|»|:|]'," ",line)
        line=line.split()
        for i in range(len(line)):
            if (line[i] not in sp)and not(line[i].isdigit()):
                sp.append(line[i].lower())
    sp.sort()
    f.close()
read_file()
def save_file(sp):
    global data
    fin = open("words", "wt", encoding="utf-8")
    for i in range (len(sp)):
        fin.write(f"{sp[i]}\n")
    fin.close()
save_file(sp)
print(f'Всего уникальных слов: {len(sp)}')
for i in range(len(sp)):
    print(f'{sp[i]}')