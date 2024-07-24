import java.util.ArrayList;

public class UserRepo extends Colleague{
    ArrayList<User> users;

    public UserRepo(ArrayList<User> users, LibraryMediator libraryMediator){
        this.users = users;
        this.libraryMediator = libraryMediator;
    }

    public User findUser(String ra){
        User user = null;
        for(int i = 0; i < this.users.size() ; i++){
            user = this.users.get(i);
            if(user.ra.equals(ra)){
                this.users.remove(i);
            }
        }
        return user;
    }
    
    public String addUser(User user){
        this.users.add(user);
        return user.ra;
    }

    public User removeUser(String ra){
        User user = null;
        for(int i = 0; i < this.users.size() ; i++){
            user = this.users.get(i);
            if(user.ra.equals(ra)){
                this.users.remove(i);
            }
        }
        return user;
    }

    //now the mediator specific functions 
    public void borrowBook(User user, Book book){
        this.libraryMediator.borrowBook(user, book);
    }
}
