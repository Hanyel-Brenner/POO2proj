class Book{
  String id;
  String title;
  String author;
  String category;
  boolean isAvailable;

  public Book(String id, String title, String author, String category){
    this.id = id;
    this.title = title;
    this.author = author;
    this.category = category;
    this.isAvailable = true;
  }
}