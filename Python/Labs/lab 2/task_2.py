
class Library:
    def __init__(self):
        self.books: dict[str, list[str]] = {}

    def add_book(self, title, author):
        if(author in self.books):
            self.books[author].append(title)
        else:
            self.books[author] = [title]

    def find_book_by_title(self, title: str):
        pairs = list(zip(self.books.keys(), self.books.values()))
        return next(iter((pair[0], title) for pair in pairs if title in pair[1]), None)
 
    def find_book_by_author(self, author):
        if(author in self.books):
            return self.books[author]
        else:
            return "Такой книги нет в системе"
        
    def remove_book(self, title, author):
        if(author in self.books):
            self.books[author].remove(title)
        else:
            print("Такого автора нет")
    

lib = Library()

lib.add_book("Книга 1", "Никита")
lib.add_book("Книга 2", "Никита")
lib.add_book("Книга 3", "Никита")
lib.add_book("Книга 1", "Влад")
lib.add_book("Книга 1", "Саша")
lib.add_book("Книга 2", "Саша")
lib.add_book("Книга 4", "Никита")

print(f"Книги автора Саша: {lib.find_book_by_author('Саша')}")
print(f"Книги автора Никита: {lib.find_book_by_author('Никита')}")
print(f"Книги автора Влад: {lib.find_book_by_author('Влад')}")

print(f"Книги: {lib.find_book_by_title('Книга 1')}")

lib.remove_book("Книга 1", "Никита")
lib.remove_book("Книга 1", "Саша")

print(f"Книги: {lib.find_book_by_title('Книга 1')}")

print(f"Книги автора Никита: {lib.find_book_by_author('Никита')}")
print(f"Книги автора Саша: {lib.find_book_by_author('Саша')}")