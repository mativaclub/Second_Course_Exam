package Memory_In_Java;

public class Person {

    String name;
    String surName;


    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    public static void changePerson(Person person) {
     Person person1 = new Person("Ilya", "Lagutenko");
        System.out.println(person);
    }

//    public static void changePerson(Person person) {
//        person.name = "Ilya";
//        person.surName = "Lagutenko";
//        System.out.println(person);
//    }



}
