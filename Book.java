class Book{
  int id;
  String title;
  String author;
  String category;
  boolean isAvailable;

  public Book(int id, String title, String author, String category){
    this.id = id;
    this.title = title;
    this.author = author;
    this.category = category;
    this.isAvailable = true;
  }
}