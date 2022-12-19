import random
def birthday(iterations_c):
    days = [day for day in range(0, 29)]
    months = [month for month in range(0, 13)]
    coincidences = 0
    not_coincidences = 0
    for iterations in range(0, iterations_c + 1):
        d_data = []
        m_data = []
        for i in range(0, 23 + 1):
            d_data.append(random.choice(days))
            m_data.append(random.choice(months))
        for i in range(0, 23):
            if d_data.count(d_data[i]) == 1 or m_data.count(m_data[i]) == 1:
                not_coincidences += 1
            for j in range(0, 23):
                if d_data[j] == d_data[i] and m_data[j] == m_data[i]:
                    coincidences += 1
    return f"количество совпадений: {coincidences} количество не совпадений: {not_coincidences} вероятность совпадения: {(coincidences * 100) / (not_coincidences + coincidences)}"
print(birthday(1000))