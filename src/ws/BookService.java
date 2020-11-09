package ws;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import model.Book;

@Service("bookService")
public class BookService {
	
	
	private static Logger logger = Logger.getLogger("bookService");
    private List<Book> books = new ArrayList<Book>();
    
    public BookService(){
        books.add(new Book(1,"Keiner","Aventuras"));
        books.add(new Book(2,"Javier","Ficcion"));
        books.add(new Book(3,"Shit","Ciencia"));
        books.add(new Book(4,"Larry","Terror"));
        books.add(new Book(5,"Bary","Drama"));
        books.add(new Book(6,"Keiner","Thriller"));
    }
    
    public void add(Book book) {
    	books.add(book);
    }
    
    public List<Book> getAll(){
        logger.info("Todos los libros!");
        return books;
    }
    
}
