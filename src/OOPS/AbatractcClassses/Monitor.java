package OOPS.AbatractcClassses;

import java.util.List;

public class Monitor extends User{
    private String section;
    private String dutyShift;

    Monitor()
    {

    }
    public Monitor(int userId, String name, String email,
                   String section, String dutyShift) {
        super(userId, name, email);//Call User Class Constructor
        this.section = section;
        this.dutyShift = dutyShift;
        this.role = "Monitor";
    }

    public void maintainDiscipline() {
        System.out.println(name + " is maintaining discipline");
    }

    public void reportIssue() {
        System.out.println(name + " reported an issue");
    }

    @Override
    public String getRole() {
        return role;
    }
}
