package Controller;

import Model.Book;
import Service.BookServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

public class Controller {


    public BookServiceImpl bookDB=new BookServiceImpl();

        @GetMapping("/get")
        public List<Book> allBooks(){


             return bookDB.getBooks();

        }

        @PostMapping("/post")
        public String addBook(@RequestBody Book book){
                bookDB.createBook(book);


            return "Sikeres mentés!";
        }
}




