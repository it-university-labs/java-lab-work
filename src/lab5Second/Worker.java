package lab5Second;

interface Workers {
    String getWorkerData();
    int getSalary();
}

class Staff implements Workers {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return id + " " + name + " "  + surname;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}

class HRManager implements Workers {
    private int id;
    private String fullName;
    private int salary;

    public HRManager(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return id + " " + fullName;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}

class Programmers implements Workers {
    private int id;
    private String nickname;
    private int salary;
    private  int bonusSalary;
    private double KPIValue;

    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    @Override
    public String getWorkerData() {
        return id + " " + nickname + " ";
    }

    @Override
    public int getSalary() {
        return (int) (salary + KPIValue * bonusSalary);
    }
}
