import java.util.Date;

public class Loan{
  int id;
  Date start;
  Date end;
  Book book;
  User user;

  public Loan(int id, User user, Book book){
    this.id = id;
    this.user = user;
    this.book = book;
    this.start = new Date();
  }
  public void setEndDate(Date endDate){
    this.end = endDate;
  }
}