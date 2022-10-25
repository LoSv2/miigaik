import random
def d_z(ch):
    chl = []
    q = 0
    a = 0
    for i in range(ch):
        s = random.randint(1,365)
        chl.append(s)
        print(chl)
    for i in range(1000):
        if chl[a] in chl:
            q +=1
        else

