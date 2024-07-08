// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {

  public static void main(String[] args) {
  }

}

class Book{
  String id;
  String title;
  String author;
  String category;
  boolean available;

  public Book(String id, String title, String author, String category){
    this.id = id;
    this.title = title;
    this.author = author;
    this.category = category;
    this.available = true;
  }
}

class User{
  String ra;
  String name;
  boolean active;

  public User(String ra, String name){
    this.ra = ra;
    this.name = name;
    boolean active = true;
  }
}

class StudentUserType extends User{
  public StudentUserType(String ra, String name){
    super(ra, name);
  }
}

class TeacherUserType extends User{
  public TeacherUserType(String ra, String name){
    super(ra, name);
  }
}

class EmployeeUserType extends User{
  public EmployeeUserType(String ra, String name){
    super(ra, name);
  }
}

class LibraryFacade{ //this will be facade
  
  boolean borrowBook(string userId, string bookId)
  { 
    //should use the library mediator to borrow it, a employee must be the one to verify the availability of the operation and change the status of the book 
  }

  public returnBook(string bookId)
  {
  }
}

class BaseBookAvailabilityNotifier{  //it is a observer class 
  
}

class BookAvailabilityNotifier{
  
}




interface Mediator{
  public void executeOperation(Colleague origin, int userType, String userId, String bookId);
}

class LibraryMediator implements Mediator{
  
  Colleague studentType, teacherType, employeeType, bookType;

  public void executeOperation(Colleague origin, int userType, String userId, String bookId){
    
  }
}

abstract class Colleague{
  public Mediator mediator;
  public void setMediator(Mediator mediator){
    this.mediator = mediator;
  }
}

class StudentColleague extends Colleague{
  
  public boolean borrowBook(String userId, String bookId){
    this.mediator.executeOperation(this, 1, userId, bookId);
    //return true;
  }
}

/*public searchBook(String bookId);
public borrowBook(User user, Book book);
public returnBook(Book book);*/
