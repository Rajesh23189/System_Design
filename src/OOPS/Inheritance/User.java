package OOPS.Inheritance;

public class User {
     String Name;
     int Id;
     private String email;
     private  String password;
     private  String clg_name;



     void Set_Clg_Name(String new_clg_Name){
         clg_name = new_clg_Name;
         System.out.println("Clg Name Change Successfully ");
     }
     void  Set_Password(String new_Password)
     {
         password = new_Password;
         System.out.println("Password Change Successfully ");
     }
     void  Show_Pass()
     {
         System.out.println("Your Password Is : "+password);
     }
     void  Set_Email(String new_Email)
    {
        password = new_Email;
        System.out.println("Password Change Successfully ");
    }


    public String getClg_name() {
        return clg_name;
    }
    public String getPassword(){
         return password;
    }
    public String getClgName(){
         return clg_name;
    }
}



