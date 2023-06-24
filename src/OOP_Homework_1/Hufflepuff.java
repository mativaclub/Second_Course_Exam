package OOP_Homework_1;

import java.util.Objects;

public class Hufflepuff extends Hogwarts {

    private final int industrious;
    private final int loyalty;
    private final int honesty;


    public Hufflepuff(String nameOfStudent, int powerOfMagic, int distanceOfTransgression,
                      int industrious, int loyalty, int honesty) {
        super(nameOfStudent, powerOfMagic, distanceOfTransgression);
        this.industrious = industrious;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustrious() {
        return industrious;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
//        System.out.print(super.toString());
        return super.toString() + "Faculty is Hufflepuff, " +
                "industrious is " + industrious +
                ", loyalty is " + loyalty +
                ", honesty is " + honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industrious == that.industrious && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industrious, loyalty, honesty);
    }


    public static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        int totalValue1 = student1.industrious + student1.loyalty + student1.honesty;
        int totalValue2 = student2.industrious + student2.loyalty + student2.honesty;
        if (totalValue1 > totalValue2) {
            System.out.println("Number of points for the student " + student1.getNameOfStudent()
                    + " is " + totalValue1 + " and he is the better student of Hufflepuff then "
                    + student2.getNameOfStudent());
        } else if (totalValue1 < totalValue2) {
            System.out.println("Number of points for the student " + student2.getNameOfStudent()
                    + " is " + totalValue2 + " and he is the better student of Hufflepuff then "
                    + student1.getNameOfStudent());
        }
    }


    public void compareHufflepuff(Hufflepuff student) {
        super.compareHogwarts(student);
        if (this.industrious > student.getIndustrious()) {
            System.out.println("Industrious of " + this.getNameOfStudent() + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.industrious < student.getIndustrious()) {
            System.out.println("Industrious of " + this.getNameOfStudent() + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Industrious of " + this.getNameOfStudent() + " and "
                    + student.getNameOfStudent() + " are equal");
        }

        if (this.loyalty > student.getLoyalty()) {
            System.out.println("Loyalty of " + this.getNameOfStudent() + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.loyalty < student.getLoyalty()) {
            System.out.println("Loyalty of " + this.getNameOfStudent() + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Loyalty of " + this.getNameOfStudent() + " and "
                    + student.getNameOfStudent() + " are equal");
        }

        if (this.honesty > student.getHonesty()) {
            System.out.println("Honesty of " + this.getNameOfStudent() + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.honesty < student.getHonesty()) {
            System.out.println("Honesty of " + this.getNameOfStudent() + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Honesty of " + this.getNameOfStudent() + " and "
                    + student.getNameOfStudent() + " are equal");
        }

    }

}


