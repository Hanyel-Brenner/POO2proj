import java.util.ArrayList;

public class BookRepo extends Colleague{
    int currentId;
    ArrayList<Book> books = new ArrayList<Book>();

    public Book findBook(Book book){
       //this function will be more complex and needs to implement the book hierarchy classes meaning its another design pattern 
    }
    
    public BookRepo(ArrayList<Book> books, LibraryMediator mediator){
        this.books = books;
        this.libraryMediator = mediator;
        this.currentId = 0;
    }

    public int addBook(Book book){
        this.books.add(book);
        return book.id;
    }

    public boolean removeBook(int bookId){
        Book book = null;
        for(int i = 0; i < this.books.size() ; i++){
            book = this.books.get(i);
            if(book.id == bookId){
                this.books.remove(i);
                return true;
            }
        }
        return false;
    }
}

