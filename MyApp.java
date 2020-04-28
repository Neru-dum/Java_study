
public class MyApp {

  public static void sayHi(String name){
    // int x = 10;
    System.out.println("Hi!" + name);
  }

  // overload
  public static void sayHi(){
    // int x = 10;
    System.out.println("Hi! Nobady!");
  }
  public static void main(String[] args){   
    sayHi(); 
    sayHi("Steve"); //引数
    // System.out.println(name);
    // System.out.println(x);
  }
}