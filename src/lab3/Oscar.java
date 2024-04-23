package lab3;
import java.util.Arrays;
import java.util.Comparator;

import java.util.Comparator;

class Oscar {
    String name;
    String surname;
    int movies;
    double rating;

    Oscar(String name, String surname, int movies, double rating) {
        this.name = name;
        this.surname = surname;
        this.movies = movies;
        this.rating = rating;
    }

    static void actorNominees(Oscar[] nominees) {
        Arrays.sort(nominees, new Comparator<Oscar>() {
            @Override
            public int compare(Oscar o1, Oscar o2) {
                if (o1.rating != o2.rating) {
                    return Double.compare(o2.rating, o1.rating);
                } else {
                    return Integer.compare(o2.movies, o1.movies);
                }
            }
        });
    }

    static void showNominees(Oscar[] nominees) {
        for (Oscar nominee : nominees) {
            System.out.println(nominee.name + " " + nominee.surname);
        }
    }
}
