import random
def paradox(number_of_checks):
    i: int = 0
    changed_choice: int = 0
    for game in range(0, number_of_checks):
        a: list = [0, 0, 1]
        player_choice: int = random.choice(a)
        if player_choice == 1:
            i += 1
        else:
            a.remove(0)
            a.remove(player_choice)
            if a[0] == 1:
                changed_choice += 1
    return f'количество не меняя выбор: {i} количество поменяв выбор: {changed_choice}'
print(paradox(1000))