package OOP_Homework_2;

public abstract class Vehicle implements Maintainable {

    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println(getModelName() + " Меняем покрышку " + getWheelsCount() + " раз");

    }


}
