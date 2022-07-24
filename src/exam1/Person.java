package exam1;

import java.util.Random;

public class Person extends Data {

    private final int Magic_Number = 5;
    private String name;
    private PersonTypeEnum type;
    private int age;


    public String getName() {
        return name;
    }

    public PersonTypeEnum getType() {
        return type;
    }

    public int getAge() {
        return age;
    }


    public Person() {
        name();
        age();
        type();
        System.out.println("************");
    }

    @Override
    protected void name() {
        namesEnum[] values = namesEnum.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        System.out.println("My name is: " + values[randIndex]);
        this.name = (values[randIndex].name());

    }

    @Override
    protected void age() {
        Random rand = new Random();
        int rand_age = rand.nextInt(20) + 20;
        System.out.println("My age is: " + rand_age);

    }


    protected void type() {
        PersonTypeEnum[] values = PersonTypeEnum.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        this.type=(values[randIndex]);
        System.out.println(type);
    }

    @Override
    protected String hello() {

        switch (getType()) {

            case Possitive:
                return getName()+" "+"Hello ";
            case Stupid:
                return getName()+" "+"Hi ";
            case Realist:
                return getAge()<=5 ?getName()+" "+"Hello ":getName()+" "+"Hi ";
            default:
                return "I don't want to greet anyone";
        }

    }


}
