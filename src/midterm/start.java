package midterm;

import midterm.Assingments;

import java.util.ArrayList;


public class start {
    public static void main(String[] args) {
        ArrayList<Assingments> assingmentsList = new ArrayList<>();

        assingmentsList.add(new Development("auth creation", "create the authentication", "in progress", "Max", "01.08.2017"));
        assingmentsList.add(new Development("form custom", "create the form customization", "frozen", "Akbota", "01.08.2017"));

        assingmentsList.add(new Designer("registration form", "make a registration form", "finished", "Aziz", "01.08.2017"));
        assingmentsList.add(new Designer("profile creation", "design the profile", "in prigress", "Aziz", "01.08.2017"));

        assingmentsList.add(new Test("test auth", "test the auth work", "not started", "Nikita", "01.08.2017"));
        assingmentsList.add(new Test("test registration", "test the registration work", "not started", "Nikita", "01.08.2017"));

        for(Assingments assingments : assingmentsList) {
            System.out.println(assingments.displayInfo());
        }

    }
}
