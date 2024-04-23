package lab4First;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    Student() {

    }

    Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id,login,password,name,surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void addCourse(String course) {
        courses[indexOfCourses++] = course;
    }

    @Override
    public String getData() {
        StringBuilder data = new StringBuilder(super.getData());
        data.append(gpa).append(" ");
        for (int i = 0; i < indexOfCourses; i++) {
            data.append(courses[i]);
            if (i < indexOfCourses - 1) {
                data.append("  ");
            }
        }
        return data.toString();
    }
}
