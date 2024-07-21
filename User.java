import java.util.ArrayList;

public abstract class User {
  String ra;
  String name;
  ArrayList<Book> booksBorrowed;

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

  public String addBorrowedBook(Book book){
    this.booksBorrowed.add(book);
    return book.id;
  }
}
 
class StudentUserType extends User{ 
  public StudentUserType(String ra, String name){
    super(ra, name);
      this.booksBorrowed = new ArrayList<Book>(3);
  }
}
 
class TeacherUserType extends User{ 
  public TeacherUserType(String ra, String name){
    super(ra , name);
    this.booksBorrowed = new ArrayList<Book>(10);
  }
}
 
class EmployeeUserType extends User{ 
  public EmployeeUserType(String ra, String name){
    super(ra , name);
    this.booksBorrowed = new ArrayList<Book>(3);
  }
}