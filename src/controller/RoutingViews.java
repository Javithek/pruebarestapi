package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Book;

@Controller
public class RoutingViews {

	private ModelAndView view = new ModelAndView();
	private ArrayList<Book> books;
	
	
	 @RequestMapping("index.htm")
	 public ModelAndView books(){
	        books = new ArrayList<Book>(); 
	        for(int i=0;i<10;i++){
	            books.add(new Book(i, "Author n° " + i, "Titulo n° " + i));
	        }
	        view.setViewName("index");
	        view.addObject("books", books);
	        return view;
	    }
	 
	 
	 @RequestMapping(value = "add.htm", method = RequestMethod.GET)
	    public ModelAndView add(){
	        
	        view.addObject("book", new Book(25,"Keiner Calpabire", "Las Aventuras de Merlin"));
	        view.setViewName("add");
	        return view;
	        
	    }
	    
	    @RequestMapping(value = "add.htm", method = RequestMethod.POST)
	    public ModelAndView add(Book book){
	        
	        books.add(book);
	        return new ModelAndView("redirect:/index.htm");
	        
	    }
	    
	    @RequestMapping(value = "edit.htm", method = RequestMethod.GET)
	    public ModelAndView edit(HttpServletRequest rq){
	        
	        Book book = new Book(30,"Keiner", "Aventuras");
	        int id = Integer.parseInt(rq.getParameter("id"));
	        for(Book b: books){
	            if(b.getId() == id){
	                book = b;
	                break;
	            }
	        }
	        view.addObject("book", book);
	        view.setViewName("edit");
	        return view;
	        
	    }
	    
	    
	    @RequestMapping(value = "edit.htm", method = RequestMethod.POST)
	    public ModelAndView edit(Book book){
	        /*
	        for(int i=0;i<books.size();i++){
	            if(book.getId() == books.get(i).getId()){
	                books.add(i, book);
	            }
	        }*/
	        return new ModelAndView("redirect:/index.htm");
	        
	    }
	    
	    @RequestMapping(value = "delete.htm", method = RequestMethod.POST)
	    public ModelAndView delete(HttpServletRequest rq){
	        /*
	        for(int i=0;i<books.size();i++){
	            if(book.getId() == books.get(i).getId()){
	                books.add(i, book);
	            }
	        }*/
	        return new ModelAndView("redirect:/index.htm");
	        
	    }
	
}
