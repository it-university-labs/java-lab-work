package lab3;

public class Task4 {
    public static void main(String[] args) {
        Student[] stud = new Student[10];

        stud[0] = new Student(1, "Max", "Astakhov", 3.5);
        stud[1] = new Student(2, "Akbota", "Moldaekova", 4.0);
        stud[2] = new Student(3, "Veronika", "Yun", 3.1);
        stud[3] = new Student(4, "Aziz", "Bakhaudunov", 2.9);
        stud[4] = new Student(5, "Zharas", "Beketov", 3.11);
        stud[5] = new Student(6, "Max1", "Astakhov1", 3.4);
        stud[6] = new Student(7, "Akbot2", "Moldaekova2", 3.1);
        stud[7] = new Student(8, "Veronik3", "Yun3", 3.05);
        stud[8] = new Student(9, "Azi4", "Bakhaudunov4", 2.81);
        stud[9] = new Student(10, "Zhara5", "Beketov5", 3.01);

        SortByGPA(stud);
    }


    static void SortByGPA(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].gpa < students[j + 1].gpa) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
