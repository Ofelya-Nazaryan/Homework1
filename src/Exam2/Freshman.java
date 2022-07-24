package Exam2;

import java.util.Random;

public class Freshman extends Shooters   {



    public Freshman(String name, int age, int shootingExperience) {
        super(name, age, shootingExperience);
    }

    public Freshman(Shooters[] shooters) {
        super(shooters);
    }

    // getShootingExperience() * 0.01 must be less than 100,because probability can't get heigher value than 1

    @Override
    public int countProb() {
        return(getShootingExperience()<=100)?  (int) (getShootingExperience() * 0.01 * shootingCount):0;
    }

    @Override
    public int countNonProb() {
        return(getShootingExperience()<=100)?  (int) (((1-getShootingExperience()* 0.01))* shootingCount):0;
    }

    @Override
    public String probablility() {
        return super.probablility();
    }

    @Override
    protected boolean fire() {
        return super.fire();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}



