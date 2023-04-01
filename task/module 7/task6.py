cities = {}
for i in range(int(input())):
    cities_raw = input().split()
    for city in cities_raw[1:]:
        cities[city] = cities_raw[0]
output = []
for i in range(int(input())):
    output.append(cities.get(input(), "Не найден"))
print("\n".join(output))