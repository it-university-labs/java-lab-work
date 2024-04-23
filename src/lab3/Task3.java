package lab3;

public class Task3 {
    public static void main(String[] args) {
        Student[] stud = new Student[5];

        stud[0] = new Student(1, "Max", "Astakhov", 3.5);
        stud[1] = new Student(2, "Akbota", "Moldaekova", 4.0);
        stud[2] = new Student(3, "Veronika", "Yun", 3.1);
        stud[3] = new Student(4, "Aziz", "Bakhaudunov", 2.9);
        stud[4] = new Student(5, "Zharas", "Beketov", 3.11);

        for(Student student : stud) {
            student.getData();
        }
    }
}
