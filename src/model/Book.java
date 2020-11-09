package model;

public class Book implements java.io.Serializable {
	
private static final long serialVersionUID = 1L;
    
    private String author;
    private String titulo;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Book(){
        
    }
    
    public Book(int id, String author, String titulo){
        
        this.id = id;
        this.author = author;
        this.titulo = titulo;
        
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
	
}
