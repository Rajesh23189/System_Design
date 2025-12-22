package OOPS;

import java.util.Scanner;

class Student
{
    String user_name;
    String address;
    int age;
    String Status;
    int roll;

    void Status_change()
    {
        this.Status = "Fail";
    }
    void bug(){

        if(this.age > 18)
               this.age  = 0;
        else
            this.age = 20;
    }
}
public class BasicOops {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student Rajesh = new Student();

        Rajesh.user_name = "Rajesh_289";
        Rajesh.address = "Ghatal";
        System.out.println("Enter Your Age :");
        Rajesh.age = sc.nextInt();
        Rajesh.bug();
        System.out.print("Enter Your Age : ");
        Rajesh.age = sc.nextInt();
        Rajesh.bug();
        if(Rajesh.age > 18)
            System.out.println("You Are Eligible To Vote");
        else
            System.out.println("You Not Are Eligible To Vote");
    }
}
