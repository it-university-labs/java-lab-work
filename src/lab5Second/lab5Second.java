package lab5Second;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lab5Second {
    public static void main(String[] args) {
        ArrayList<Workers> workersList = new ArrayList<>();

        workersList.add(new Staff(1, "Max", "Astakhov", 10500));
        workersList.add(new Staff(2, "Karl", "Miller", 280000));

        workersList.add(new HRManager(6, "Will Smith", 350000));
        workersList.add(new HRManager(7, "Jeniffer Lopez", 320000));

        workersList.add(new Programmers(11, "user123", 400000, 70000, 0.8));
        workersList.add(new Programmers(12, "123user", 420000, 60000, 0.9));


        Workers highestSalaryWorker = Collections.max(workersList, Comparator.comparing(Workers::getSalary));
        System.out.println("highest salary: " + highestSalaryWorker.getWorkerData() + ", Salary: " + highestSalaryWorker.getSalary());

        Collections.sort(workersList, Comparator.comparingInt(Workers::getSalary).reversed());

        System.out.println("\nSorted workers:");
        for (Workers worker : workersList) {
            System.out.println(worker.getWorkerData() + ", Salary: " + worker.getSalary());
        }
    }
}
