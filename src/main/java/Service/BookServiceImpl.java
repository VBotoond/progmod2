package Service;

import Model.Book;
import Model.LanguageEnum;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.*;


@Service
public class BookServiceImpl implements BookService
    {
        private final String filePath="./src/main/resources/bookshelf.csv";

        @Override
        public void createBook(Book book){
            File file = new File(filePath);


            try {
                FileWriter outputfile = new FileWriter(file, true);

                CSVWriter writer = new CSVWriter(outputfile);

                String[] data= {book.title, book.author, book.language.toString(), book.pages};

                writer.writeNext(data);
                writer.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public  List<Book> getBooks() {
            List<Book> books = new ArrayList();

            try {
                FileReader fileReader = new FileReader(filePath);
                CSVReader csvReader = new CSVReader(fileReader);

                String[] nextRecord;

                while ((nextRecord = csvReader.readNext()) != null) {
                    Book book =new Book();

                    book.setTitle(nextRecord[0]);
                    book.setAuthor(nextRecord[1]);

                    if(nextRecord[2].equals(LanguageEnum.Hungarian.toString())){
                        book.language= LanguageEnum.Hungarian;
                    }
                    else if(nextRecord[2].equals(LanguageEnum.English.toString())){
                        book.language= LanguageEnum.English;
                    }
                    else{
                        book.language= LanguageEnum.German;
                    }
                    book.setPages(nextRecord[3]);
                    books.add(book);
                }
            }

            catch (Exception e) {
                e.printStackTrace();
            }

            return books;
        }
    }


