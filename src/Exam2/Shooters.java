package Exam2;

import java.util.Random;

public abstract class Shooters {
    protected final int shootingCount = 50;// I use to find the probable
    private String name;
    private int age;
    private int shootingExperience;
    private Shooters[] shooters;

    public Shooters(String name, int age, int shootingExperience) {
        this.name = name;
        this.age = age;
        this.shootingExperience = shootingExperience;
    }

    public Shooters(Shooters[] shooters) {
        this.shooters = shooters;
    }


    protected abstract int countProb();
    protected abstract int countNonProb();

    public String toString() {

        return " ###########################" +
                "'\n name='" + getName() + '\'' +
                "'\n age='" + getAge() + '\'' +
                "'\n shootingExperience=" + getShootingExperience() +
                "'\n Target hitting=" + fire() +
                "'\n ###########################\n\n";
    }

    protected boolean fire() {

        boolean fire= probablility().equals("Kpel em");

        return fire;

    }

    public String probablility() {


        int length1 = countProb();
        int length2 = countNonProb();
        int length = length1 + length2;

        if (length>0) {
            String myArray1[] = new String[length];

            for (int i = 0; i < myArray1.length; i++) {
                if (i <= length1) {
                    myArray1[i] = "Kpel em";
                } else {
                    myArray1[i] = "Chem Kpel";
                }
            }
            Random random=new Random();
            int randomElement=random.nextInt(myArray1.length);
            return myArray1[randomElement];
        }   else
            return "I can't make calculation,try with other arguments";}


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getShootingExperience() {
        return shootingExperience;
    }

    public Shooters[] getShooters() {
        return shooters;
    }
}











