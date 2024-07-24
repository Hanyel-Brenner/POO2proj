import java.util.ArrayList;

public class LibraryFacade {
    BookRepo books;
    UserRepo users;
    LoanRepo loans;
    LibraryMediator libraryMediator;

    /*public void setUserRepository(ArrayList<User> users){
        this.users = users;
    }
    public void setBookRepository(ArrayList<Book> books){
        this.books = books;
    }
    public void setLoanRepository(ArrayList<Loan> loans){
        this.loans = loans;
    }
    public void setLibraryMediator(LibraryMediator libraryMediator){
        this.libraryMediator = libraryMediator;
    }*/
    public LibraryFacade(UserRepo users, BookRepo books, LoanRepo loans){
        this.users = users;
        this.books = books;
        this.loans = loans;
        LoanRequestProcessor processors[] = new LoanRequestProcessor[3];
        processors[0] = new BookAvailabilityHandler(users, books, loans);
        processors[1] = new UserEligibilityHandler(users, books, loans);
        processors[2] = new LoanLimitHandler(users, books, loans);
        this.libraryMediator = new LibraryMediator(books, users, loans, processors);
    }

    public void borrowBook(User user, Book book){

    }
    public void returnBook(Book book){

    }
    public void searchBook(){}
    
}
