package exam1;

public class Main {

    public static void main(String[] args) {
        Person[] myPerson = new Person[5];
        for (int i = 0; i < 5; i++) {
            myPerson[i] = new Person();
        }

        for (int i = 0; i < myPerson.length; i++) {
            for (int j = 0; j < myPerson.length; j++) {
                if(i!=j){
                    Person firstPerson=myPerson[i];
                    Person secondPerson=myPerson[j];
                    System.out.println( firstPerson.hello()+" "+secondPerson.getName());
                    System.out.println( secondPerson.hello()+" "+firstPerson.getName());}

            }
        }
    }

}

