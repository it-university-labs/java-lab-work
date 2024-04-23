package lab6.second;
import java.util.ArrayList;

public class Students {
    String name;
    String surname;
    int ENTpoints;
    double gpa;

    Students(){}
    Students(String name, String surname, int ENTpoints, double gpa) {
        this.name = name;
        this.surname=  surname;
        this.ENTpoints = ENTpoints;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getENTpoints() {
        return ENTpoints;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setENTpoints(int ENTpoints) {
        this.ENTpoints = ENTpoints;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void add(Students students) {
    }
}

class University {
    private String name;
    private int year;
    private ArrayList<Students> students;

    public University(String name, int year) {
        this.name = name;
        this.year = year;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    public int getStudentsAmount() {
        return students.size();
    }

    public void addStudent(Students students) {
        students.add(students);
    }

    public double getAverageGPA() {
        if (students.isEmpty())
            return 0;

        double totalGPA = 0;
        for (Students student : students) {
            totalGPA += student.getGpa();
        }
        return totalGPA / students.size();
    }

    public double getAverageENTpoints() {
        if (students.isEmpty())
            return 0;

        double totalENT = 0;
        for (Students student : students) {
            totalENT += student.getENTpoints();
        }
        return totalENT / students.size();
    }
}
