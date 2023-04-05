def get_books(name):
    books = []
    name = name.lower()
    with open("books.csv", "r", encoding="utf-8") as f:
        f.readline()
        for line in f:
            isbn, title, author, quantity, price = line.strip().split("|")
            if name in title.lower():
                books.append((isbn, title, author, int(quantity), float(price)))
    return books
def get_totals(books):
    result = []
    for book in books:
        price = book[3] * book[4]
        if price>=500:
            result.append((book[0], price))
        else:
            price+=100
            result.append((book[0],price))
    return result


print(get_totals(get_books("Python")))