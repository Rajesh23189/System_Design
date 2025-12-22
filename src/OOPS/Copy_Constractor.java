package OOPS;


class Worker
{
    String Name;
    String email;
    int id;
    int age;
    String address;

    Worker()
    {

    }

    Worker(String Name , String address,int id,int age , String email)
    {
        this.Name  = Name;
        this.address = address;
        this.age = age;
        this.email = email;
        this.id = id;
    }

    //copy Constractor
    Worker(Worker other)
    {
        Name = other.Name;
        address = other.address;
        id = other.id;
        age = other.age;
        email = other.email;
    }


}
public class Copy_Constractor {
    public static void main(String args[])
    {
              Worker Rajesh = new Worker();
              Rajesh.email = "rajeshmanik721211@gmail.com";
              Rajesh.Name= "Rajesh Manik";
              Rajesh.age = 20;
              Rajesh.id = 721211;
              Rajesh.address = "West Bengal , Ghatal , 721211";

              Worker Kuheli  = new Worker(Rajesh);//Copy The Variable Of Rajesh Object

              System.out.println(Kuheli.Name+" || "+Kuheli.address+" || "+Kuheli.age+" || "+Kuheli.id+" || "+Kuheli.email);


              Kuheli.Name = "Kuheli Manik"; //It Change

              System.out.println(Kuheli.Name);
              System.out.println(Rajesh.Name);


    }
}
