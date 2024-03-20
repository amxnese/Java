import java.util.LinkedList;
import java.util.List;
interface CRUDOperations {
  void create(User obj);
  // User read(String username);
  void update(User obj);
  void delete(String username);
}

class UserManager implements CRUDOperations{
  List<User> userList = new LinkedList<>();

  UserManager(){};
  
  public void create(User obj){
    System.out.println("");
  };
  // public User read(String username){
    
  // };
  public void update(User obj){

  };
  public void delete(String username){
    
  };
}

class User{
  String userName;
  String passWord;
  String getUserName(){
    return this.userName;
  }
  String getPassWord(){
    return this.passWord;
  }
}






