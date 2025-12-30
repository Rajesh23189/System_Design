package OOPS.AbatractcClassses;

import java.util.PriorityQueue;

public abstract  class User {
    protected int userId;
    protected String name;
    protected String email;
    protected String role;


    User()
    {

    }

    User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public void login() {
        System.out.println(name + " logged in");
    }

    public void logout() {
        System.out.println(name + " logged out");
    }

    public void viewProfile() {
        System.out.println("ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Role: " + role);
    }

    public abstract String getRole();//Abastract Method
    public abstract String JobDes(); //Abastract Method
}
