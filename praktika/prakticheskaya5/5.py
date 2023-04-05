def openfile(filename):
    opened = False
    try:
        file = open(filename, "r")
        opened = True
        count = int(file.readline())
        return [int(x) for x in [file.readline() for _ in range(count)]]
    except FileNotFoundError:
        print("Данный файл не найден, повторите попытку")
    except ValueError:
        print(f"В файле присутствуют не только числа!")
    except Exception as e:
        print(f"Неизвестная ошибка! {type(e)}, {e=}")
    finally:
        if opened:
            file.close()
try:
    name=input("Введите название файла: ")
    while filename := name:
        if result := openfile(filename):
            print(result)
            break
except EOFError:
    print("Ошибка ввода")