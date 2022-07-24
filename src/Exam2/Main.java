package Exam2;

public class Main {

    public static void main(String[] args) {

        Shooters[] shooters = new Shooters[]{
                new Freshman("Ofelya Nazaryan", 25, 4),
                new Experienced("Angelina Jolie", 46, 18),
                new Professional("Brad Pitt", 58, 42),};

        for (Shooters myShooters : shooters) {
            System.out.println(myShooters.toString());
        }
    }
}
