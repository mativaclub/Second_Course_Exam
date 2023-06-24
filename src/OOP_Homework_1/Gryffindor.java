package OOP_Homework_1;

import java.util.Objects;

public class Gryffindor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int bravery;


    public Gryffindor(String nameOfStudent, int powerOfMagic, int distanceOfTransgression,
                      int nobility, int honor, int bravery) {
        super(nameOfStudent, powerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
//        System.out.print(super.toString());
        return super.toString() + "Faculty is Gryffindor, " +
                "nobility is " + nobility +
                ", honor is " + honor +
                ", bravery is " + bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }


    public static void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        int totalValue1 = student1.nobility + student1.bravery + student1.honor;
        int totalValue2 = student2.nobility + student2.bravery + student2.honor;
        if (totalValue1 > totalValue2) {
            System.out.println("Number of points for the student " + student1.getNameOfStudent()
                    + " is " + totalValue1 + " and he is the better student of Gryffindor then "
                    + student2.getNameOfStudent());
        } else if (totalValue1 < totalValue2) {
            System.out.println("Number of points for the student " + student2.getNameOfStudent()
                    + " is " + totalValue2 + " and he is the better student of Gryffindor then "
                    + student1.getNameOfStudent());
        }
    }

    public void compareGryffindor(Gryffindor student) {
        super.compareHogwarts(student);
        if (this.nobility > student.getNobility()) {
            System.out.println("Nobility of " + this.getNameOfStudent() + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.nobility < student.getNobility()) {
            System.out.println("Nobility of " + this.getNameOfStudent() + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Nobility of " + this.getNameOfStudent() + " and "
                    + student.getNameOfStudent() + " are equal");
        }

        if (this.bravery > student.getBravery()) {
            System.out.println("Bravery of " + this.getNameOfStudent() + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.bravery < student.getBravery()) {
            System.out.println("Bravery of " + this.getNameOfStudent() + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Bravery of " + this.getNameOfStudent() + " and "
                    + student.getNameOfStudent() + " are equal");
        }


        if (this.honor > student.getHonor()) {
            System.out.println("Honor of " + this.getNameOfStudent() + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.honor < student.getHonor()) {
            System.out.println("Honor of " + this.getNameOfStudent() + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Honor of " + this.getNameOfStudent() + " and "
                    + student.getNameOfStudent() + " are equal");
        }
    }


}
