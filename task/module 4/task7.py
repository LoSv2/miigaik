a = int(input())
if a == int(str(a)[::-1]):
    print('Да')
else:
    print('Нет')