public class LoanLimitHandler extends LoanRequestProcessor {

        public LoanLimitHandler(UserRepo userRepo, BookRepo bookRepo, LoanRepo loanRepo){
            super(userRepo, bookRepo, loanRepo);
        }
    
        public boolean isLoanPossible(User user, Book book){
            if(user.isLimitReached()){
                return false;
            }
            else return true;
        }
    }

