name=''
n=''
list_contact={}
def Name():
    global name
    name=input("Введите имя ")
    name=name.title()
    name=name.strip()
    return name
def Num():
    global n
    n=input("Введите номер ")
    n=n.replace(' ','')
    n=n.replace('-','')
    if len(n)==10 and n[0]=='9':
        n= '+7'+n
    if n[0]=='8' and len(n)==11:
        n='+7'+n[1:]
    if n[0]=='7' and len(n)==11:
        n='+'+n
    if n[:2]=='+7' and len(n)==12:
        return n
    else:
        print("Номер введён неверно")
        return Num()
def Cont(dict,name,num):
    dict[name]=num
    print("Контакт добавлен")
    return dict
def show(dict):
    print("Список контактов")
    for i in dict:
        print(i,dict[i])
def namein():
    Name()
    if name in list_contact:
        return True
    else:
        return False
def dell():
    if namein() :
        list_contact.pop(name)
        print("Контакт удалён")
    else:
        print("Данного контакта не существует")
def re():
    if namein() :
        Num()
        list_contact[name]=n
        print("Контакт изменён")
    else:
        print("Имя введено неверно")
def menu():
    print("Выберети дейстие: \n1.Добавить контакт\n2.Показать контакты.\n3.Удалить контакт\n4.Изменить номер\n5.Выход")
    while True:
        p=int(input())
        if p==1:
            Cont(list_contact,Name(),Num())
            return menu()
        if p==2:
            show(list_contact)
            return menu()
        if p==5:
            break
        if p==3:
            dell()
            return menu()
        if p==4:
            re()
            return menu()
menu()