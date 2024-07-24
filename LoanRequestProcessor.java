public abstract class LoanRequestProcessor implements IProcessor{
    LoanRequestProcessor next;
    UserRepo userRepo;
    BookRepo bookRepo;
    LoanRepo loanRepo;

    public LoanRequestProcessor(UserRepo userRepo, BookRepo bookRepo, LoanRepo loanRepo){
        this.userRepo = userRepo;
        this.bookRepo = bookRepo;
        this.loanRepo = loanRepo;
    }
    
    public void setNextHandler(LoanRequestProcessor next){
        this.next = next;
    }

}
