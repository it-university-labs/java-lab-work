package lab4First;

public class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    Staff() {

    }

    Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login,password,name,surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addSubject(String subject) {
        subjects[indexOfSubject++] = subject;
    }

    @Override
    public String getData() {
        StringBuilder data = new StringBuilder(super.getData());
        data.append(" ").append(salary);
        for(int i=0;i<indexOfSubject;i++) {
            data.append(subjects[i]);
            if(i<indexOfSubject - 1) {
                data.append(" .");
            }
        }
        return data.toString();
    }


}
