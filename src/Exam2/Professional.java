package Exam2;

public class Professional  extends Shooters {

    public Professional(String name, int age, int shootingExperience) {
        super(name, age, shootingExperience);
    }

    public Professional(Shooters[] shooters) {
        super(shooters);
    }

    // (0.9-getAge() * 0.01) must be less than 90,because probability can't get heigher value than 1

    @Override
    public int countProb() {
        return (getAge()<=90)?(int) ((0.9-getAge() * 0.01) * shootingCount):0;
    }

    @Override
    public int countNonProb() {

        return  (getAge()<=90)?(int) ( (1 - (0.9-getAge() * 0.01)) * shootingCount):0;
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



