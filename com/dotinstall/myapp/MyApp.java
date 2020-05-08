package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
// import com.dotinstall.myapp.model.*;

public class MyApp {
  public static void main(String[] args){   
    User tom = new User("sum");
    // System.out.println(tom.name);
    tom.sayHi();

    AdminUser bob = new AdminUser("sum");
    // System.out.println(bob.name);
    bob.sayHi();
    bob.sayHello();
  }
}