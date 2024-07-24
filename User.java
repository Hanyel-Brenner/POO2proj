import java.util.ArrayList;

public abstract class User {
  String ra;
  String name;
  ArrayList<Book> booksBorrowed;
  int loanLimit;
  int debtValue = 0;

  public User(String ra, String name) {
    this.ra = ra;
    this.name = name;
  }  

  public String setUserName(String name) {
    this.name = name;
    return name;
  }

  public String getUserName(){
    return this.name;
  }

  public int addBorrowedBook(Book book){
    this.booksBorrowed.add(book);
    return book.id;
  }

  public boolean isLimitReached(){
    if(this.booksBorrowed.size() == loanLimit) return true;
    return false;
  }

  public boolean isEligible(){
    if(debtValue != 0) return false;
    return true;
  }
}
 
class StudentUserType extends User{ 
  public StudentUserType(String ra, String name){
    super(ra, name);
      this.booksBorrowed = new ArrayList<Book>(3);
      this.loanLimit = 3;
  }
}
 
class TeacherUserType extends User{ 
  public TeacherUserType(String ra, String name){
    super(ra , name);
    this.booksBorrowed = new ArrayList<Book>(10);
    this.loanLimit = 10;
  }
}
 
class EmployeeUserType extends User{ 
  public EmployeeUserType(String ra, String name){
    super(ra , name);
    this.booksBorrowed = new ArrayList<Book>(3);
    this.loanLimit = 3;
  }
}