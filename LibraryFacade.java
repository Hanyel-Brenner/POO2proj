import java.util.ArrayList;

public class LibraryFacade {
    ArrayList<Book> books;
    ArrayList<User> users;

    public void setUserDataReference(ArrayList<User> users){
        this.users = users;
    }
    public void setBookDataReference(ArrayList<Book> books){
        this.books = books;
    }

    public void borrowBook(){}
    public void returnBook(){}
    public void searchBook(){}
    
}
