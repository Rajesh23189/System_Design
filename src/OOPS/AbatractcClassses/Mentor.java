package OOPS.AbatractcClassses;


public class Mentor extends User{

    private String specialization;
    private int experienceYears;


    Mentor()
    {

    }
    Mentor(int userId, String name, String email,
                  String specialization, int experienceYears) {

        super(userId, name, email);//Call User Class Constructor
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.role = "Mentor";
    }

    public void guideStudent() {
        System.out.println(name + " is guiding students");
    }

    public void evaluatePerformance() {
        System.out.println(name + " is evaluating performance");
    }

    @Override
    public String getRole() {
        return role;
    }
}
