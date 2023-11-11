package task1;

public class Magistracy extends Student{
    String researchName;

    public Magistracy(String firstName, String lastName, String group, double averageMark, String researchName) {
        super(firstName, lastName, group, averageMark);
        this.researchName = researchName;
    }

    public Magistracy() {
    }
    public String getScholarship()
    {
        if(averageMark < 8) return "180 rub";
        return "200 rub";
    }
}
