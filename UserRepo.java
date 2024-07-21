import java.util.ArrayList;

public class UserRepo {
    ArrayList<User> users = new ArrayList<User>();
    
    public String addUser(User user){
        this.users.add(user);
        return user.ra;
    }

    public String removeUser(String id){
        
    }
}
