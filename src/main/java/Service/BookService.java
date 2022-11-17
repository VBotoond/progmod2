package Service;

import Model.Book;


import java.util.List;

public interface BookService {
    public abstract void createBook(Book book);

    public abstract List<Book> getBooks();
}
