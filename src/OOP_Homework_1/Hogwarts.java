package OOP_Homework_1;

import java.util.Objects;

public class Hogwarts {

    private final String nameOfStudent;
    private final int powerOfMagic;
    private final int distanceOfTransgression;

    public Hogwarts(String nameOfStudent, int powerOfMagic, int distanceOfTransgression) {
        this.nameOfStudent = nameOfStudent;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }


    @Override
    public String toString() {
        return "Hogwarts student: " + nameOfStudent +
                ", power of Magic is " + powerOfMagic +
                ", distance of Transgression is " + distanceOfTransgression + ", ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return powerOfMagic == hogwarts.powerOfMagic && distanceOfTransgression == hogwarts.distanceOfTransgression && Objects.equals(nameOfStudent, hogwarts.nameOfStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStudent, powerOfMagic, distanceOfTransgression);
    }


    public void compareHogwarts(Hogwarts student) {
        if (this.powerOfMagic > student.getPowerOfMagic()) {
            System.out.println("Magic power " + this.nameOfStudent + " is higher then " + student.getNameOfStudent());
        } else if (this.powerOfMagic < student.getPowerOfMagic()) {
            System.out.println("Magic power " + this.nameOfStudent + " is lower then " + student.getNameOfStudent());
        } else {
            System.out.println("Magic power of " + this.nameOfStudent + " and "
                    + student.getNameOfStudent() + " are equal");
        }

        if (this.distanceOfTransgression > student.getDistanceOfTransgression()) {
            System.out.println("Distance Of Transgression " + this.nameOfStudent + " is higher then "
                    + student.getNameOfStudent());
        } else if (this.powerOfMagic < student.getPowerOfMagic()) {
            System.out.println("Distance Of Transgression " + this.nameOfStudent + " is lower then "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Distance Of Transgression of " + this.nameOfStudent + " and "
                    + student.getNameOfStudent() + " are equal");
        }
    }


}



