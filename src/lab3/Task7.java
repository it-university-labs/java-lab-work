package lab3;

public class Task7 {
    public static void main(String[] args) {
        Group[] groups = {
                new Group("SIS-1804", 4, new Tourist[] {
                        new Tourist("Kazybek", 5000, "YES"),
                        new Tourist("Aruzhan", 12000, "YES"),
                        new Tourist("Bekbolat", 7000, "NO"),
                        new Tourist("Alina", 9500, "YES")
                }),
                new Group("SIS-1811", 3, new Tourist[] {
                        new Tourist("Dias", 9000, "YES"),
                        new Tourist("Tamerlan", 13000, "NO"),
                        new Tourist("Amir", 10000, "YES")
                })
        };

        for (Group group : groups) {
            System.out.println(group.name + " - " + group.expeditionPlan());
        }
    }
}
