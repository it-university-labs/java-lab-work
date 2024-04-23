package lab4First;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users = new User[15];

        Student student1 = new Student(1, "stud1", "stud1", "Max", "Astakhov", 3.67);
        student1.addCourse("Computer science");
        student1.addCourse("PE");
        users[0] = student1;

        Student student2 = new Student(2, "stud2", "stud2", "Kara", "Kilo", 3.34);
        student1.addCourse("Theory");
        student1.addCourse("English");
        users[1] = student2;

        Staff staff1 = new Staff(3, "staff1", "staff1", "Mike", "White", 10000.00);
        staff1.addSubject("PE");
        staff1.addSubject("Theory");
        users[2] = staff1;

        User user1 = new User(4, "user1", "user1", "Hank", "Shrader");
        users[3] = user1;

        for(User user : users) {
            if(user != null) {
                System.out.println(user.getData());
            }
        }

        int count = 0;
        while(true) {
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO ADD STUDENT");
            System.out.println("PRESS [3] TO ADD STAFF");
            System.out.println("PRESS [4] TO LIST USERS");
            System.out.println("PRESS [5] TO LIST STUDENTS");
            System.out.println("PRESS [6] TO LIST STAFF");
            System.out.println("PRESS [0] TO EXIT");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    System.out.println("Enter user's initials");
                    System.out.println("id: ");
                    int id = scanner.nextInt();
                    System.out.println("login: ");
                    String login = scanner.next();
                    System.out.println("password: ");
                    String password = scanner.next();
                    System.out.println("name: ");
                    String name = scanner.next();
                    System.out.println("surname: ");
                    String surname = scanner.next();
                    users[count++] = new User(id,login,password,name,surname);
                    break;
                case 2:
                    System.out.println("Enter student's initials:");
                    System.out.print("id: ");
                    id = scanner.nextInt();
                    System.out.print("login: ");
                    login = scanner.next();
                    System.out.print("password: ");
                    password = scanner.next();
                    System.out.print("name: ");
                    name = scanner.next();
                    System.out.print("surname: ");
                    surname = scanner.next();
                    System.out.print("gpa: ");
                    double gpa = scanner.nextDouble();
                    Student student = new Student(id, login, password, name, surname, gpa);
                    String course = scanner.next();
                    student.addCourse(course);
                    users[count++] = student;
                    break;
                case 3:
                    System.out.println("Enter staff initials:");
                    System.out.print("id: ");
                    id = scanner.nextInt();
                    System.out.print("login: ");
                    login = scanner.next();
                    System.out.print("password: ");
                    password = scanner.next();
                    System.out.print("name: ");
                    name = scanner.next();
                    System.out.print("surname: ");
                    surname = scanner.next();
                    System.out.print("salary: ");
                    double salary = scanner.nextDouble();
                    Staff staff = new Staff(id, login, password, name, surname, salary);
                    String subject = scanner.next();
                    staff.addSubject(subject);

                    users[count++] = staff;
                    break;
                case 4:
                    for (int i = 0; i < count; i++) {
                        System.out.println(users[i].getData());
                    }
                    break;
                case 5:
                    for (int i = 0; i < count; i++) {
                        if (users[i] instanceof Student) {
                            System.out.println(users[i].getData());
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < count; i++) {
                        if (users[i] instanceof Staff) {
                            System.out.println(users[i].getData());
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
