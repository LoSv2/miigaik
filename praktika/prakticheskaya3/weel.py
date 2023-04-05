import random
bl = "\u25A0"
c = 0
w = 0
def menu():
    global live
    print("Выберете сложность игры\n 1.Легко\n 2.Средне \n 3.Трудно\n 4.Невозможно")
    sl=input()
    if sl == "1":
        live = 8
    elif sl == "2":
        live = 5
    elif sl == "3":
        live = 3
    elif sl == "4":
        live = 1
    else:
        return menu()



def game ():
    global nv
    global c
    global w
    if live==0:
        print(f"Вы проиграли\nВаш счёт {w}")
        score()
        return False
    if d[c] == nv:
        c += 1
        w += 1
        if c == len(d):
            print(f'Вы отгадали все слова\nВаш счёт {w}')
            score()
            return False
        print("Вы отгадали слово!!! Поздравляю\n Хотите продолжить(1;2)")
        pr=input()
        if pr=='1':
            xxx()
            game()
        else:
            print(f"Ваш счёт {w}")
            score()
            return False
    else:
        #print(d[c])
        print(f'{nv} {live}♥')
        vvod()
        return game()
def worlds():
    global d
    f=open("words.txt", encoding="utf-8")
    a=f.readline()
    d=a.split()
    random.shuffle(d)
    xxx()
def xxx():
    global nv
    nv = ''
    for i in range(len(d[c])):
        nv += bl
    return d

def vvod():
    print("Введите букву или слово целиком")
    b=input()
    global nv
    global live
    if b in d[c] and b!=d[c] and b not in nv :
        ind= [i for i, ltr in enumerate(d[c]) if ltr == b]
        for i in ind:
            nv=nv[:i]+b+nv[i+1:]
    elif b==d[c]:
        nv=d[c]
    elif b in nv:
        print("Эту букву уже называли ")
    else:
        print("Такой буквы в слове нет")
        live-=1

def score():
    global data
    fin = open("score.txt.", "rt",encoding="utf-8")
    data = fin.read()
    if int(data)<w:
        data = data.replace(data, str(w))
    fin.close()
    fin = open("score.txt", "wt", encoding="utf-8")
    fin.write(data)
    fin.close()
    return print(f'Ваш рекорд {data}')