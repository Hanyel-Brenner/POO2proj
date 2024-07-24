public class BookAvailabilityHandler extends LoanRequestProcessor {
    
    public BookAvailabilityHandler(UserRepo userRepo, BookRepo bookRepo, LoanRepo loanRepo){
        super(userRepo, bookRepo, loanRepo);
    }

    public boolean isLoanPossible(User user, Book book){
        Book foundBook = this.bookRepo.findBook(book);
        if(foundBook == null) return false;
        else return this.next.isLoanPossible(user, foundBook); 
    }
}
