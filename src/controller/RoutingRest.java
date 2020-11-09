package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Book;
import model.BookList;
import ws.BookService;

@RestController
public class RoutingRest {
	
	@Resource(name = "bookService")
    private BookService bookws;
    
	
	@RequestMapping(value = "/books", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Book> getBooks(){
		
		List<Book> lista = new ArrayList<Book>();
		BookList bookslist = new BookList();
		bookslist.setData(bookws.getAll());
		return new ResponseEntity(bookslist.getData(), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		bookws.add(book);
		return new ResponseEntity(book, HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value = "/book", method = RequestMethod.GET)
    public ResponseEntity<Book> getBook(@RequestParam(value = "id") long id) {
		List<Book> listBook = bookws.getAll();
		Book book = new Book();
		for(Book b: listBook) {
			if(b.getId() == id) {
				book = b;
				break;
			}
		}
		
        return new ResponseEntity(book, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ResponseEntity<Book> delete(@RequestParam(value = "id") long id) {
		List<Book> listBook = bookws.getAll();
		Book book = new Book();
		for(int i=0;i<listBook.size();i++) {
			if(listBook.get(i).getId() == id) {
				book = listBook.get(i);
				listBook.remove(i);
				break;
			}
		}
	
        return new ResponseEntity(book, HttpStatus.OK);
    }
	
}
