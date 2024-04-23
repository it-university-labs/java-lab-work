package lab6.second;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();
        for(int i=1;i<=20;i++) {
            students.add(new Students("Name" + i, "Surname" + i, (int) (Math.random() * 100), Math.random() * 4.0));
        }

        University university1 = new University("AlmaU", 2020);
        University university2 = new University("IITU", 2010);

        for(int i = 0;i<10;i++) {
            university1.addStudent(students.get(i));
        }

        for(int i = 10;i<20;i++) {
            university2.addStudent(students.get(i));
        }

        System.out.println("University 1 Statistics:");
        System.out.println("Total Students: " + university1.getStudentsAmount());
        System.out.println("Average GPA: " + university1.getAverageGPA());
        System.out.println("Average ENT points: " + university1.getAverageENTpoints());

        System.out.println("\nUniversity 2 Statistics:");
        System.out.println("Total Students: " + university2.getStudentsAmount());
        System.out.println("Average GPA: " + university2.getAverageGPA());
        System.out.println("Average ENT points: " + university2.getAverageENTpoints());
    }
}
