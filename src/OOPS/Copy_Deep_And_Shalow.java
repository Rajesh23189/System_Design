package OOPS;

class JobLess
{
    String Name;
    String email;
    int id;
    int age;
    String address;

    JobLess()
    {

    }

    JobLess(String Name , String address,int id,int age , String email)
    {
        this.Name  = Name;
        this.address = address;
        this.age = age;
        this.email = email;
        this.id = id;
    }

    //copy Constractor
    JobLess(JobLess other)
    {
        Name = other.Name;
        address = other.address;
        id = other.id;
        age = other.age;
        email = other.email;
    }


}
public class Copy_Deep_And_Shalow {

    public static  void main(String  args[])
    {
        JobLess Rajesh = new JobLess();
        Rajesh.email = "rajeshmanik721211@gmail.com";
        Rajesh.Name= "Rajesh Manik";
        Rajesh.age = 20;
        Rajesh.id = 721211;
        Rajesh.address = "West Bengal , Ghatal , 721211";

        JobLess Kuheli  = new JobLess(Rajesh);//Copy  The Variable Of Rajesh Object help to copy Constructor
    }
}
