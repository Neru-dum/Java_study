
class User {
  String name; 
  
   // constructor
  User(String name){
    this.name = name;
  }
  User(){
    this.name = "Me!";
  }
  void sayHi(){
    System.out.println("hi!" + this.name);
  }
}
public class MyApp {
  public static void main(String[] args){   
    // int x;
    // String s;
    // Class
    User tom; //参照型
    // tom = new User("Tom");
    tom = new User();
    System.out.println(tom.name);
    tom.sayHi();
  }
}