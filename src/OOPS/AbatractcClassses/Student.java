package OOPS.AbatractcClassses;

public class Student extends User{
    private String rollNumber;
    private String course;


    Student()
    {
        super(2563, "Rajesh Manik", "rohitmanik68@gmail.com");//Call User Class Constructor
    }
   Student(int userId, String name, String email,
                   String rollNumber, String course) {
        super(userId, name, email);//Call User Class Constructor
        this.rollNumber = rollNumber;
        this.course = course;
        this.role = "Student";
    }

    public void submitAssignment() {
        System.out.println(name + " submitted assignment");
    }

    public void attendClass() {
        System.out.println(name + " is attending class");
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public String JobDes(){
        return "Study Heard";
    }
}
