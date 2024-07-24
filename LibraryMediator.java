public class LibraryMediator {
    BookRepo bookRepo;
    UserRepo userRepo;
    LoanRepo loanRepo;
    LoanRequestProcessor processors[];

    public LibraryMediator(BookRepo bookRepo, UserRepo userRepo, LoanRepo loanRepo, LoanRequestProcessor processors[]){
        this.bookRepo = bookRepo;
        this.userRepo = userRepo;
        this.loanRepo = loanRepo;
        this.processors = processors;
        this.processors[0].setNextHandler(this.processors[1]);
        this.processors[1].setNextHandler(this.processors[2]);
    }

    public void borrowBook(User user, Book book){
            //here find for book using as aid the bookAvailability, UserEligibility and LoanLimitHandler
            boolean isLoanPossible = false;
            isLoanPossible = this.processors[0].isLoanPossible(user,book);
            if(isLoanPossible == true){
                Loan loan = new Loan(this.loanRepo.currentId, user, book);
                this.loanRepo.addLoan(loan);
                user.addBorrowedBook(book);
            }        
    }

    public void returnBook(Book book){
        
    }
}
