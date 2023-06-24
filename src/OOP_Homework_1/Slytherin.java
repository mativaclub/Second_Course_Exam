package OOP_Homework_1;

import java.util.Objects;

public class Slytherin extends Hogwarts {

    private final int cunning;
    private final int resoluteness;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;


    public Slytherin(String nameOfStudent, int powerOfMagic, int distanceOfTransgression,
                     int cunning, int resoluteness, int ambition, int resourcefulness, int lustForPower) {
        super(nameOfStudent, powerOfMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }


    public int getCunning() {
        return cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
//        System.out.print(super.toString());
        return super.toString() + "Faculty is Slytherin, " +
                "cunning is " + cunning +
                ", resoluteness is " + resoluteness +
                ", ambition is " + ambition +
                ", resourcefulness is " + resourcefulness +
                ", lust for Power is " + lustForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && resoluteness == slytherin.resoluteness &&
                ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness &&
                lustForPower == slytherin.lustForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, resoluteness, ambition, resourcefulness, lustForPower);
    }


    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int totalValue1 = student1.cunning + student1.resoluteness + student1.ambition
                + student1.resourcefulness + student1.lustForPower;
        int totalValue2 = student2.cunning + student2.resoluteness + student2.ambition
                + student2.resourcefulness + student2.lustForPower;
        if (totalValue1 > totalValue2) {
            System.out.println("Number of points for the student " + student1.getNameOfStudent()
                    + " is " + totalValue1 + " and he is the better student of Slytherin then "
                    + student2.getNameOfStudent());
        } else if (totalValue1 < totalValue2) {
            System.out.println("Number of points for the student " + student2.getNameOfStudent()
                    + " is " + totalValue2 + " and he is the better student of Slytherin then "
                    + student1.getNameOfStudent());
        }
    }

    public void compareSlytherin(Slytherin student) {
        super.compareHogwarts(student);
        if (this.cunning > student.getCunning()) {
            System.out.println("Cunning of " + this.getNameOfStudent() + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.cunning < student.getCunning()) {
            System.out.println("Cunning of " + this.getNameOfStudent() + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Cunning of " + this.getNameOfStudent() + " and "
                    + student.getNameOfStudent() + " are equal");
        }


        if (this.resoluteness > student.getResoluteness()) {
            System.out.println("Resoluteness of " + this.getNameOfStudent() + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.resoluteness < student.getResoluteness()) {
            System.out.println("Resoluteness of " + this.getNameOfStudent() + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Resoluteness of " + this.getNameOfStudent() + " and "
                    + student.getNameOfStudent() + " are equal");
        }


        if (this.ambition > student.getAmbition()) {
            System.out.println("Ambition of " + this.getNameOfStudent() + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.ambition < student.getAmbition()) {
            System.out.println("Ambition of " + this.getNameOfStudent() + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Ambition of " + this.getNameOfStudent() + " and "
                    + student.getNameOfStudent() + " are equal");
        }


        if (this.resourcefulness > student.getResourcefulness()) {
            System.out.println("Resourcefulness of " + this.getNameOfStudent() + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.resourcefulness < student.getResourcefulness()) {
            System.out.println("Resourcefulness of " + this.getNameOfStudent() + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Resourcefulness of " + this.getNameOfStudent() + " and "
                    + student.getNameOfStudent() + " are equal");
        }


        if (this.lustForPower > student.getLustForPower()) {
            System.out.println("LustForPower of " + this.getNameOfStudent() + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.lustForPower < student.getLustForPower()) {
            System.out.println("LustForPower of " + this.getNameOfStudent() + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("LustForPower of " + this.getNameOfStudent() + " and "
                    + student.getNameOfStudent() + " are equal");
        }


    }

}
