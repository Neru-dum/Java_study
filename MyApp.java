// final: 変更ができない

final class User {
  protected String name;
  private static final double VERSION = 1.1;

  public User(String name){
    this.name = name;
    User.VERSION = 1.2;
  }
  
  public final void sayHi() {
    System.out.println("hi!" + this.name);
  }
}

  class AdminiUser extends User{
    public AdminiUser(String name){
      super(name);
    }
  }

  @Override
  public final void sayHi(){
    System.out.println("[admin] hi!" + this.name);
  }