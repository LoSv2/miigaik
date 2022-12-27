numbers = [int(x) for x in input().split()]
a = set()
for number in numbers:
    if number in a:
        print("ДА")
    else:
        print("НЕТ")
        a.add(number)