package Exam2;

public class Experienced extends Shooters {

    public Experienced(String name, int age, int shootingExperience) {
        super(name, age, shootingExperience);
    }

    // getShootingExperience() * 0.05 must be less than 20,because probability can't get heigher value than 1

    @Override
    public int countProb() {
        return(getShootingExperience()<=20)? (int) (getShootingExperience() * 0.05 * shootingCount):0;
    }

    @Override
    public int countNonProb() {
        return (getShootingExperience()<=20)?(int) ((1-getShootingExperience() *0.05) * shootingCount):0;
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
