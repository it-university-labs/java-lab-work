package lab6.fifth;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Max Black", 10000, 2, 2);
        System.out.println(worker);
        System.out.println("Work done by worker: " + worker.toWork(5));

        Programmer programmer = new Programmer("Max White", 5000, 2, 1.5, 3);
        System.out.println(programmer);
        System.out.println("Work done by programmer: " + programmer.toWork(5));
    }
}
