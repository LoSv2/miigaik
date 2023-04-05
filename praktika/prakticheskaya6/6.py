import re
patern =r'^Рейс\s*(\d+)\s*(?:прибыл|отправился)\s*(из|в)\s*([А-яA-z]+)\s*(из|в)\s*(\d+:\d+:\d+)'
with open("ras", "r", encoding="utf-8") as s:
    with open("iz", "w", encoding="utf-8") as new:
        for i in s:
            a = re.search(patern, i)
            if a:
                new.write(f"[{a.groups()[4]}] Поезд № {a.groups()[0]} {a.groups()[1]} {a.groups()[2]}\n")