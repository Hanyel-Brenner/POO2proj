import java.util.ArrayList;

public class LoanRepo extends Colleague{
    int currentId;
    ArrayList<Loan> loans;

    public LoanRepo(ArrayList<Loan> loans, LibraryMediator libraryMediator){
        this.loans = loans;
        this.libraryMediator = libraryMediator;
        this.currentId = 0;
    }

    public Loan findLoan(int id){
        Loan loan = null;
        for(int i = 0; i < this.loans.size() ; i++){
            loan = this.loans.get(i);
            if(loan.id == id){
                this.loans.remove(i);
            }
        }
        return loan;
    }
    
    public int addLoan(Loan loan){
        this.loans.add(loan);
        this.currentId++;
        return loan.id;
    }

    public Loan removeLoan(int id){
        Loan loan = null;
        for(int i = 0; i < this.loans.size() ; i++){
            loan = this.loans.get(i);
            if(loan.id == id){
                this.loans.remove(i);
            }
        }
        return loan;
    }

}

