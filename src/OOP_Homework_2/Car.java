package OOP_Homework_2;

public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println(getModelName() + " Проверяем двигатель");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }

}

