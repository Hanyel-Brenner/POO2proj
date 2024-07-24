public class UserEligibilityHandler extends LoanRequestProcessor {

    public UserEligibilityHandler(UserRepo userRepo, BookRepo bookRepo, LoanRepo loanRepo){
        super(userRepo, bookRepo, loanRepo);
    }

    public boolean isLoanPossible(User user, Book book){
        if(user.isEligible()){
            return this.next.isLoanPossible(user, book);
        }
        else return false;
    }
}
